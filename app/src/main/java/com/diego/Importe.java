package com.diego;

/**
 * Created by 24547744m on 07/10/15.
 */
public class Importe {
    private long mes;
    private long total;

    public Importe() {
    }

    public void calculaImporte(long precioInmueble, long ahorros, long plazo, long euribor, long diferencial) {

        float capital = precioInmueble - ahorros;
        float difere = diferencial + euribor;
        float interes= (difere/100)/12;
        float divident = capital * interes;

        float interesdiv = (( 1 + interes));
        float part2 = (float) (1 - Math.pow (interesdiv,(plazo*-12)));
        float divisor = (part2);

        float cuotaMes = divident/divisor;
        float total = cuotaMes * plazo*12;

        //Seteando los valores//
        setMes(Long.parseLong(String.valueOf(cuotaMes)));
        setTotal(Long.parseLong(String.valueOf(total)));

    }


    public long getMes() {
        return mes;
    }

    public void setMes(long mes) {
        this.mes = mes;
    }

    public long getTotal() {
        return total;
    }

    public void setTotal(long total) {
        this.total = total;
    }

}
