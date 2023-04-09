public class ReporteVentas {
    private String fecha;
    private int ventasDelMes;
    private int gastosGeneralesMes;
    private int beneficioNetoMes;

    // CONSTRUCTORES
    public ReporteVentas() {

    }

    public ReporteVentas(String fecha, int ventasDelMes, int gastosGeneralesMes, int beneficioNetoMes) {
        this.fecha = fecha;
        this.ventasDelMes = ventasDelMes;
        this.gastosGeneralesMes = gastosGeneralesMes;
        this.beneficioNetoMes = beneficioNetoMes;
    }

    // METODOS ---------------------------

    // FECHA
    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getFecha() {
        return fecha;
    }

    // VENTAS DEL MES
    public void setVentasDelMes(int ventasDelMes) {
        this.ventasDelMes = ventasDelMes;
    }

    public int getVentasDelMes() {
        return ventasDelMes;
    }

    // GASTOS GENERALES DEL MES
    public void setGastosGeneralesMes(int gastosGeneralesMes) {
        this.gastosGeneralesMes = gastosGeneralesMes;
    }

    public int getGastosGeneralesMes() {
        return gastosGeneralesMes;
    }

    // BENEFICIO NETO DEL MES
    public void setBeneficioNetoMes(int beneficioNetoMes) {
        this.beneficioNetoMes = beneficioNetoMes;
    }

    public int getBeneficioNetoMes() {
        return beneficioNetoMes;
    }
}
