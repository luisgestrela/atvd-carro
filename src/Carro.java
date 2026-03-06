
public class Carro {
    private String marca;
    private int velocidade_atual = 0;
    private int velocidade_maxima;

    Carro (){};

    Carro(String marca, int velocidade_atual, int velocidade_maxima) {
        this.marca = marca;
        this.velocidade_atual = velocidade_atual;
        this.velocidade_maxima =velocidade_maxima;
    }

    public String getMarca (){
        return marca;
    }
    public void setMarca(String marca){
        this.marca = marca;
    }
    public int getVelocidade_atual (){
        return velocidade_atual;
    }
    public void setVelocidade_atual (int velocidade_atual){
        this.velocidade_atual = velocidade_atual;

    }
    public int getVelocidade_maxima (){
        return velocidade_maxima;
    }
    public void setVelocidade_maxima(int velocidade_maxima){
        this.velocidade_atual = velocidade_maxima;

    }

    public void acelerar(int newvelocidade){
        this.velocidade_atual += newvelocidade;
        if (this.velocidade_atual >= 0 && this.velocidade_atual < this.velocidade_maxima) {
            System.out.println(this.velocidade_atual +" ->Carro acelerado com sucesso");
        }
        else if(this.velocidade_atual >= 0 && this.velocidade_atual >= this.velocidade_maxima){
            System.out.println("Ta indo devagar né painho ?? vai dar pra acelerar nao");
            this.velocidade_atual -= newvelocidade;
        } else if (this.velocidade_atual < 0){
            System.out.println("Problema em detectar velocidade do carro !!");
        }
    }
    public void freiar (int newvelocidade){
        if(this.velocidade_atual > newvelocidade && this.velocidade_atual <= velocidade_maxima){
            this.velocidade_atual -= newvelocidade;
        }
    }


}
