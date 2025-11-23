package org.example;

public class NumeroAdapter extends NumeroInteiro {

    private INumero numeroMorse;

    public NumeroAdapter(INumero numeroMorse) {
        this.numeroMorse = numeroMorse;
    }

    public String recuperarNumero() {
        if (this.getNum() == 0)
            numeroMorse.setNumero("-----");
        else
            if (this.getNum() == 1)
                numeroMorse.setNumero(".----");
            else
                if (this.getNum() == 2)
                    numeroMorse.setNumero("..---");
                else
                    if (this.getNum() == 3)
                        numeroMorse.setNumero("...--");
                    else
                        if (this.getNum() == 4)
                            numeroMorse.setNumero("....-");
                        else
                            if (this.getNum() == 5)
                                numeroMorse.setNumero(".....");
        return numeroMorse.getNumero();
    }

    public void salvarNumero() {
        if (numeroMorse.getNumero().equals("-----"))
            this.setNum(0);
        else
            if (numeroMorse.getNumero().equals(".----"))
                this.setNum(1);
            else
                if (numeroMorse.getNumero().equals("..---"))
                    this.setNum(2);
                else
                    if (numeroMorse.getNumero().equals("...--"))
                        this.setNum(3);
                    else
                        if (numeroMorse.getNumero().equals("....-"))
                            this.setNum(4);
                        else
                            if (numeroMorse.getNumero().equals("....."))
                                this.setNum(5);
    }
}
