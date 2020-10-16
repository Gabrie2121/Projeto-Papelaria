package projetointerdiciplinar;

import interfaceManipulacao.Manipulacao;
import javax.swing.JOptionPane;

public class CaixaLapis extends Produto implements Manipulacao {

    private int quantidade;
    private boolean colorido;

    public CaixaLapis() {

    }

    public CaixaLapis(int quantidade, boolean colorido) {
        this.quantidade = quantidade;
        this.colorido = colorido;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public boolean isColorido() {
        return colorido;
    }

    public void setColorido(boolean colorido) {
        this.colorido = colorido;
    }
    //Método para cadastrar Objeto Caixa de Lápis
    @Override
    public boolean cadastro() {

        setQuantidade(Integer.parseInt(JOptionPane.showInputDialog("\nCadastro Caixa de Lápis:\n Digite a quantidade de lápis: ")));
        String colorido = JOptionPane.showInputDialog("Os lápis são coloridos? Digite sim ou não: ");
        
        if (colorido.equalsIgnoreCase("sim")) {
            setColorido(true);
        } else {
            setColorido(false);
        }

        setMarca(JOptionPane.showInputDialog("Digite a marca da caixa lápis: "));

        setValor(Float.parseFloat(JOptionPane.showInputDialog("Digite o valor da caixa de lápis: ")));

        return true;

    }
    //Método para Consultar Objeto Caixa de Lápis
    @Override
    public String consulta() {
        String cor;
        if (this.colorido == true) {
            cor = "Sim";
        } else {
            cor = "Não";
        }
        return " \nColorido: " + cor + " \nQuantidade: " + this.quantidade
                + "\nMarca: " + getMarca() + "\nValor: " + getValor();
    }

    @Override
    public String toString() {
        return "quantidade: " + quantidade + "colorido: " + colorido;
    }

}
