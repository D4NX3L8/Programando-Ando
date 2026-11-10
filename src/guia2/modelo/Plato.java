package guia2.modelo;

/**
 * Guia 2 - Modulo A (POO).
 * Entidad de negocio del proyecto: un plato del restaurante.
 *
 * Atributos: id, nombre, categoria, precio, disponible (minimo 4, guia 3.4).
 *
 * TODO (Daniel): verificar getters/setters y las validaciones del modelo.
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
        this.nombre = nombre;
        this.categoria = categoria;
        this.precio = precio;
        this.disponible = disponible;
    }

    public Plato(int id, String nombre, String categoria, double precio, boolean disponible) {
        this.id = id;
        this.nombre = nombre;
        this.categoria = categoria;
        this.precio = precio;
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
        this.nombre = nombre;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
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
