public class itensCar{

    private int idProduto;
    private int quant;

    public itensCar(int id, int quant){

        this.idProduto = id;
        this.quant = quant;
    }


    public int getIdProduto() {
    return idProduto;
    }

    public void setIdProduto(int idProduto) {
        this.idProduto = idProduto;
    }

    public int getQuant() {
        return quant;
    }

    public void setQuant(int quant) {
        this.quant = quant;
    }
}

