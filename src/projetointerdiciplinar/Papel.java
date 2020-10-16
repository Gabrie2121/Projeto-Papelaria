package projetointerdiciplinar;

import interfaceManipulacao.Manipulacao;
import javax.swing.JOptionPane;

public class Papel extends Produto implements Manipulacao {

    private String cor;
    private String tipo;
    private float largura;
    private float altura;
    private int gramatura;
    private boolean paltado;

    public Papel() {

    }

    public Papel(String cor, String tipo, float largura, float altura, int gramatura, boolean paltado) {
        this.cor = cor;
        this.tipo = tipo;
        this.largura = largura;
        this.altura = altura;
        this.gramatura = gramatura;
        this.paltado = paltado;
    }

    //Metodos de acessos
    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public float getLargura() {
        return largura;
    }

    public void setLargura(float largura) {
        this.largura = largura;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public int getGramatura() {
        return gramatura;
    }

    public void setGramatura(int gramatura) {
        this.gramatura = gramatura;
    }

    public boolean isPaltado() {
        return paltado;
    }

    public void setPaltado(boolean paltado) {
        this.paltado = paltado;
    }
    //Método para cadastrar Objeto Papel
    @Override
    public boolean cadastro() {
        
        setCor(JOptionPane.showInputDialog("Cadastro Papel:\nDigite a cor do papel: "));
        setTipo(JOptionPane.showInputDialog("Digite o tipo do papel: "));
        setLargura(Float.parseFloat(JOptionPane.showInputDialog("Digite a largura do papel: ")));
        
        setAltura(Float.parseFloat(JOptionPane.showInputDialog("Digite a altura do papel: ")));
        setGramatura(Integer.parseInt(JOptionPane.showInputDialog("Digite a gramatura do papel: ")));
        
        String paltado = JOptionPane.showInputDialog("O papel é paltado? Digite sim ou não: ");
        if (paltado.equalsIgnoreCase("sim") || paltado.equalsIgnoreCase("SIM")) {
            setPaltado(true);
        } else {
            setPaltado(false);
        }
        setMarca(JOptionPane.showInputDialog("Digite a marca: "));
        setValor(Float.parseFloat(JOptionPane.showInputDialog("Digite o valor: ")));
        return true;
    }
    //Método para consultar Objeto Papel
    @Override
    public String consulta() {
        String palta;
        if (this.paltado == true) {
            palta = "Sim";
        } else {
            palta = "Não";
        }
        return "\nCor: " + this.cor + " \nTipo: " + this.tipo + " \nLargura: " + this.largura
                + " \nAltura: " + this.altura + " \nGramatura: " + this.gramatura + " \nPaltado: "
                + palta + "\nMarca: " + getMarca() + "\nValor: " + getValor();
    }

    @Override
    public String toString() {
        return "Papel{" + "cor=" + cor + ", tipo=" + tipo + ", largura="
                + largura + ", altura=" + altura + ", gramatura=" + gramatura + ", paltado=" + paltado + '}';
    }

}
