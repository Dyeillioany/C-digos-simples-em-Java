public class Circulo {

    double raio;
    double area;
    double perimetro;

    public Circulo(double raio) {
        this.raio = raio;
    }

    public void calculaArea() {
        this.area = 2 * 3.14 * this.raio;
    }

    public void calculaPerimetro() {
        this.perimetro = 3.14 * Math.pow(this.raio, 2);
    }

    public double areaRetorno() {
        return this.area;
    }

    public double perimetroRetorno() {
        return this.perimetro;
    }
}