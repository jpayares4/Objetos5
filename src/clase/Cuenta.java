/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase;

/**
 *
 * @author Payares
 */
public class Cuenta {
   private int N_cuenta;
    private int I_cliente;
    private double S_actual;
    private double Interes;

    public Cuenta(int N_cuenta, int I_cliente, double S_actual, double Interes) {
        this.N_cuenta = N_cuenta;
        this.I_cliente = I_cliente;
        this.S_actual = S_actual;
        this.Interes = Interes;
    }

    public int getNum_cuenta() {
        return N_cuenta;
    }

    public void setNum_cuenta(int N_cuenta) {
        this.N_cuenta = N_cuenta;
    }

    public int getI_cliente() {
        return I_cliente;
    }

    public void setI_cliente(int I_cliente) {
        this.I_cliente = I_cliente;
    }

    public double getS_actual() {
        return S_actual;
    }
    public void setS_actual(double S_actual) {
        this.S_actual = S_actual;
    }

    public double getInteres() {
        return Interes;
    }

    public void setInteres(double interes) {
        this.Interes = interes;
    }

    public double actualizar_saldo() {
        double int_diario, aux;
        double saldo_actualizado;
        aux = this.Interes / 365;
        int_diario = (this.S_actual * aux) / 100;

        this.S_actual = this.S_actual - int_diario;
        saldo_actualizado = this.S_actual;

        return saldo_actualizado;
    }

    public double ingresar(double ingreso) {
        double nuevo;
        if (ingreso <= 0) {
            nuevo = 0;
        } else {
            this.S_actual = this.S_actual + ingreso;
            nuevo = this.S_actual;
        }
        return nuevo;
    }

    public double retirar(double retiro) {
        double saldo_retirado = 0;
        if (retiro <= this.S_actual) {
            if (retiro <= 0) {
                saldo_retirado = -1;
            } else {
                this.S_actual = this.S_actual - retiro;
                saldo_retirado = this.S_actual;
            }
        } else {
            saldo_retirado = -1;
        }
        return saldo_retirado;
    }

    public Cuenta mostrar() {
        Cuenta c;
        int N, I_cliente;
        double S_actual, Interes;
        N = this.N_cuenta;
        I_cliente = this.I_cliente;
        S_actual = this.S_actual;
        Interes = this.Interes;
        c = new Cuenta(N, I_cliente, S_actual, Interes);
        return c;
    } 
}
