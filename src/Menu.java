public class Menu {
    private String entrada;
    private String platoFuerte;
    private String postre;
    private int precioDeEntrada;
    private int precioDePlatoFuerte;
    private int precioDePostre;

    // CONSTRUCTORES
    public Menu() {

    }

    public Menu(String entrada, String platoFuerte, String postre, int precioDeEntrada, int precioDePlatoFuerte,
            int precioDePostre) {
        this.entrada = entrada;
        this.platoFuerte = platoFuerte;
        this.postre = postre;
        this.precioDeEntrada = precioDeEntrada;
        this.precioDePlatoFuerte = precioDePlatoFuerte;
        this.precioDePostre = precioDePostre;
    }

    // METODOS ---------------------------

    // ENTRADA
    public void setEntrada(String entrada) {
        this.entrada = entrada;
    }

    public String getEntrada() {
        return entrada;
    }

    // ENTRADA PRECIO
    public void setPrecioDeEntrada(int precioDeEntrada) {
        this.precioDeEntrada = precioDeEntrada;
    }

    public int getPrecioDeEntrada() {
        return precioDeEntrada;
    }

    // PLATO FUERTE
    public void setPlatoFuerte(String platoFuerte) {
        this.platoFuerte = platoFuerte;
    }

    public String getPlatoFuerte() {
        return platoFuerte;
    }

    // PLATO FUERTE PRECIO
    public void setPrecioDePlatoFuerte(int precioDePlatoFuerte) {
        this.precioDePlatoFuerte = precioDePlatoFuerte;
    }

    public int getPrecioDePlatoFuerte() {
        return precioDePlatoFuerte;
    }

    // POSTRE
    public void setPostre(String postre) {
        this.postre = postre;
    }

    public String getPostre() {
        return postre;
    }

    // POSTRE PRECIO
    public void setPrecioDePostre(int precioDePostre) {
        this.precioDePostre = precioDePostre;
    }

    public int getPrecioDePostre() {
        return precioDePostre;
    }

}
