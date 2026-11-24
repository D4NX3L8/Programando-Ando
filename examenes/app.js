const EXAM_MEMBERS = [
  {
    key: "daniel",
    name: "Daniel Ochoa Taborda",
    role: "Persistencia, modelos, DAO y ejercicios de lógica.",
    label: "Daniel"
  },
  {
    key: "jeronimo",
    name: "Jeronimo Henao",
    role: "Login, sesión, flujo de la aplicación y ejercicios de lógica.",
    label: "Jeronimo"
  },
  {
    key: "juan",
    name: "Juan Pablo Arismendy",
    role: "Interfaz CRUD, validaciones y documentación.",
    label: "Juan Pablo"
  }
];

const PASS_PERCENT = 70;
const homeScreen = document.querySelector("#home-screen");
const quizScreen = document.querySelector("#quiz-screen");
const resultScreen = document.querySelector("#result-screen");
const memberList = document.querySelector("#member-list");
const examPicker = document.querySelector("#exam-picker");
const examList = document.querySelector("#exam-list");
const backToMembers = document.querySelector("#back-to-members");

let selectedMemberKey = null;
let activeExam = null;
let answers = [];
let currentQuestion = 0;

function makeElement(tag, className, text) {
  const element = document.createElement(tag);
  if (className) {
    element.className = className;
  }
  if (text !== undefined) {
    element.textContent = text;
  }
  return element;
}

function showCatalog() {
  homeScreen.hidden = false;
  quizScreen.hidden = true;
  resultScreen.hidden = true;
  window.scrollTo({ top: 0, behavior: "smooth" });
}

function renderMembers() {
  for (const [index, member] of EXAM_MEMBERS.entries()) {
    const card = makeElement("button", "member-card");
    card.type = "button";
    card.setAttribute("aria-label", `Ver simulacros de ${member.name}`);
    card.append(
      makeElement("span", "member-number", String(index + 1)),
      makeElement("h3", "", member.name),
      makeElement("p", "", member.role),
      makeElement("span", "card-link", "Ver sus 3 exámenes →")
    );
    card.addEventListener("click", () => selectMember(member.key));
    memberList.append(card);
  }
}

function selectMember(memberKey) {
  selectedMemberKey = memberKey;
  const member = EXAM_MEMBERS.find((item) => item.key === memberKey);
  const memberExams = window.EXAMS.filter((exam) => exam.memberKey === memberKey);
  document.querySelector("#exams-title").textContent = `Simulacros de ${member.name}`;
  examList.replaceChildren();

  for (const exam of memberExams) {
    const card = makeElement("button", "exam-card");
    card.type = "button";
    card.append(
      makeElement("span", "tag", `EXAMEN ${exam.examNumber} · ${exam.questions.length} PREGUNTAS`),
      makeElement("h3", "", exam.title),
      makeElement("p", "", exam.focus),
      makeElement("span", "question-count", "Preguntas de selección única · Con revisión al final")
    );
    card.addEventListener("click", () => startExam(exam));
    examList.append(card);
  }

  examPicker.hidden = false;
  showCatalog();
  examPicker.scrollIntoView({ behavior: "smooth", block: "start" });
}

function startExam(exam) {
  activeExam = exam;
  answers = Array(exam.questions.length).fill(null);
  currentQuestion = 0;
  renderQuestion();
  homeScreen.hidden = true;
  resultScreen.hidden = true;
  quizScreen.hidden = false;
  window.scrollTo({ top: 0, behavior: "smooth" });
}

function renderQuestion() {
  const question = activeExam.questions[currentQuestion];
  const isLast = currentQuestion === activeExam.questions.length - 1;
  quizScreen.replaceChildren();

  const wrap = makeElement("div", "quiz-wrap");
  const topline = makeElement("div", "quiz-topline");
  const backButton = makeElement("button", "", "← Volver a los exámenes");
  backButton.type = "button";
  backButton.addEventListener("click", () => {
    if (answers.some((answer) => answer !== null)
        && !window.confirm("¿Salir del examen? Perderás las respuestas de este intento.")) {
      return;
    }
    showCatalog();
  });
  topline.append(
    backButton,
    makeElement("span", "tag", `${activeExam.member} · Examen ${activeExam.examNumber}`)
  );

  const progressLabel = makeElement("div", "progress-label");
  progressLabel.append(
    makeElement("span", "", `Pregunta ${currentQuestion + 1} de ${activeExam.questions.length}`),
    makeElement("span", "", `${answers.filter((answer) => answer !== null).length}/${answers.length} respondidas`)
  );

  const progressTrack = makeElement("div", "progress-track");
  progressTrack.setAttribute("role", "progressbar");
  progressTrack.setAttribute("aria-valuemin", "0");
  progressTrack.setAttribute("aria-valuemax", String(activeExam.questions.length));
  progressTrack.setAttribute("aria-valuenow", String(currentQuestion + 1));
  const progressValue = makeElement("div", "progress-value");
  progressValue.style.width = `${((currentQuestion + 1) / activeExam.questions.length) * 100}%`;
  progressTrack.append(progressValue);

  const title = makeElement("h1", "quiz-title", activeExam.title);
  const card = makeElement("article", "quiz-card");
  card.append(
    makeElement("p", "question-type", "Pregunta de sustentación"),
    makeElement("h2", "question-text", question.prompt)
  );

  const fieldset = makeElement("fieldset", "answer-list");
  const legend = makeElement("legend", "visually-hidden", "Escoge una respuesta");
  fieldset.append(legend);

  const nextButton = makeElement(
    "button",
    isLast ? "primary-button" : "nav-button primary-button",
    isLast ? "Finalizar y ver resultado" : "Siguiente pregunta →"
  );
  nextButton.type = "button";
  nextButton.disabled = answers[currentQuestion] === null;

  question.options.forEach((option, index) => {
    const label = makeElement("label", "answer-option");
    const input = document.createElement("input");
    input.type = "radio";
    input.name = "answer";
    input.value = String(index);
    input.checked = answers[currentQuestion] === index;
    input.addEventListener("change", () => {
      answers[currentQuestion] = index;
      nextButton.disabled = false;
      status.textContent = "Respuesta guardada en este intento.";
      progressLabel.lastChild.textContent =
        `${answers.filter((answer) => answer !== null).length}/${answers.length} respondidas`;
    });
    label.append(input, makeElement("span", "answer-text", option));
    fieldset.append(label);
  });

  const status = makeElement(
    "p",
    "quiz-status",
    answers[currentQuestion] === null
      ? "Selecciona una respuesta para continuar."
      : "Respuesta guardada en este intento."
  );
  const actions = makeElement("div", "quiz-actions");
  const previousButton = makeElement("button", "nav-button", "← Anterior");
  previousButton.type = "button";
  previousButton.disabled = currentQuestion === 0;
  previousButton.addEventListener("click", () => {
    currentQuestion--;
    renderQuestion();
  });
  nextButton.addEventListener("click", () => {
    if (answers[currentQuestion] === null) {
      status.textContent = "Selecciona una respuesta antes de continuar.";
      return;
    }
    if (isLast) {
      renderResult();
    } else {
      currentQuestion++;
      renderQuestion();
    }
  });
  actions.append(previousButton, status, nextButton);
  card.append(fieldset, actions);
  wrap.append(topline, progressLabel, progressTrack, title, card);
  quizScreen.append(wrap);
}

function renderResult() {
  const correctCount = activeExam.questions.reduce(
    (total, question, index) => total + (answers[index] === question.answer ? 1 : 0),
    0
  );
  const percentage = Math.round((correctCount / activeExam.questions.length) * 100);
  const passed = percentage >= PASS_PERCENT;
  resultScreen.replaceChildren();

  const wrap = makeElement("div", "result-wrap");
  const card = makeElement("div", "result-card");
  const heading = makeElement("div", "result-heading");
  const score = makeElement("div", "score-circle");
  score.append(
    makeElement("strong", "", `${percentage}%`),
    makeElement("span", "", `${correctCount} de ${activeExam.questions.length}`)
  );
  heading.append(
    score,
    makeElement("p", "eyebrow", passed ? "BUEN DOMINIO" : "SIGUE PRACTICANDO"),
    makeElement("h1", "", passed ? "Simulacro aprobado" : "Repasa estos temas"),
    makeElement(
      "p",
      "",
      `${activeExam.member} · ${activeExam.title}. Umbral de práctica: ${PASS_PERCENT}%.`
    )
  );

  const actions = makeElement("div", "result-actions");
  const retryButton = makeElement("button", "primary-button", "Repetir este examen");
  retryButton.type = "button";
  retryButton.addEventListener("click", () => startExam(activeExam));
  const catalogButton = makeElement("button", "secondary-button", "Elegir otro examen");
  catalogButton.type = "button";
  catalogButton.addEventListener("click", showCatalog);
  actions.append(retryButton, catalogButton);

  const reviewTitle = makeElement("h2", "review-title", "Revisión y explicación");
  const review = makeElement("div", "review-list");
  activeExam.questions.forEach((question, index) => {
    const isCorrect = answers[index] === question.answer;
    const item = makeElement("article", `review-item ${isCorrect ? "correct" : "incorrect"}`);
    item.append(
      makeElement("h3", "", `${index + 1}. ${question.prompt}`),
      makeElement(
        "p",
        isCorrect ? "correct-answer" : "chosen-answer",
        `Tu respuesta: ${question.options[answers[index]]}`
      )
    );
    if (!isCorrect) {
      item.append(
        makeElement("p", "correct-answer", `Respuesta correcta: ${question.options[question.answer]}`)
      );
    }
    item.append(makeElement("p", "", question.explanation));
    review.append(item);
  });

  card.append(heading, actions, reviewTitle, review);
  wrap.append(card);
  resultScreen.append(wrap);
  homeScreen.hidden = true;
  quizScreen.hidden = true;
  resultScreen.hidden = false;
  window.scrollTo({ top: 0, behavior: "smooth" });
}

backToMembers.addEventListener("click", () => {
  examPicker.hidden = true;
  window.scrollTo({ top: memberList.offsetTop, behavior: "smooth" });
});

renderMembers();
