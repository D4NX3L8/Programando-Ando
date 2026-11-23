package guia2.modelo;

/**
 * Guia 2 - Modulo A (POO).
 * Entidad de negocio del proyecto: un plato del restaurante.
 *
 * Atributos: id, nombre, categoria, precio, disponible (minimo 4, guia 3.4).
 */
public class Plato {

    private int id;
    private String nombre;
    private String categoria;
    private double precio;
    private boolean disponible;

    public Plato() {
    }

    public Plato(String nombre, String categoria, double precio, boolean disponible) {
        setNombre(nombre);
        setCategoria(categoria);
        setPrecio(precio);
        this.disponible = disponible;
    }

    public Plato(int id, String nombre, String categoria, double precio, boolean disponible) {
        this.id = id;
        setNombre(nombre);
        setCategoria(categoria);
        setPrecio(precio);
        this.disponible = disponible;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if (nombre == null || nombre.trim().isEmpty()) {
            throw new IllegalArgumentException("El nombre del plato no puede estar vacio.");
        }
        this.nombre = nombre.trim();
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        if (categoria == null || categoria.trim().isEmpty()) {
            throw new IllegalArgumentException("La categoria no puede estar vacia.");
        }
        this.categoria = categoria.trim();
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        if (precio < 0) {
            throw new IllegalArgumentException("El precio no puede ser negativo.");
        }
        this.precio = precio;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    @Override
    public String toString() {
        return String.format("#%d | %-25s | %-12s | $%,.0f | %s",
                id, nombre, categoria, precio, disponible ? "Disponible" : "Agotado");
    }
}
