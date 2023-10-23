public class ItensCar{

    private int idProduto;
    private int quant;
    private double subTotal;
  
    public ItensCar(int id, int quant, double subTotal){
  
      this.idProduto = id;
      this.quant = quant;
      this.subTotal = subTotal;
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
    
    public double getSubTotal() {
      return subTotal;
    }
    
    public void setQuant(double subTotal) {
      this.subTotal = subTotal;
    }
  }  