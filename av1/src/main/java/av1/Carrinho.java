import java.util.ArrayList;
import java.util.Scanner;

public class Carrinho {

  ArrayList<ItensCar> itens = new ArrayList<>();

  private double total;

  public Boolean incluirCarrinho(ArrayList<Produto> produtos){

    int id, aux = 0;
    int quant, auxQuant;
    double subTotal;

    Scanner sc = new Scanner(System.in);

    System.out.println("\n\nDigite o id do produto: ");
    id = sc.nextInt();

    System.out.println("Digite a quantidade: ");
    quant = sc.nextInt();

    for(Produto i : produtos){

      if(id == i.getId()){

        if(buscaCarrinho(itens, id, aux)){

          auxQuant = itens.get(aux).getQuant() + quant;
          itens.get(aux).setQuant(auxQuant);

          subTotal = i.getValor() * auxQuant;
          itens.get(aux).setSubTotal(subTotal);

          total += i.getValor() * quant;
          
          return true;
        }
        else{
          
          subTotal = i.getValor() * quant;
          
          ItensCar item = new ItensCar(id, quant, subTotal);
  
          itens.add(item);
  
          total += (i.getValor() * quant);
      
          return true;
        }
      }
    }

    return false;
  }

  public void listarCarrinho(ArrayList<Produto> produtos){

    System.out.println("\n\n=====================");
    System.out.println("Seu Carrinho\n\n");

    for(ItensCar i : itens){

      int id = i.getIdProduto();
      int quant = i.getQuant();

      for(Produto j : produtos){
        
        if(id == j.getId()){
          
          System.out.println(i.getQuant() + "  " + j.getNome() + "  " + i.getSubTotal());
        }
      }
    }

    System.out.println("\nTotal: R$" + getTotal());

    System.out.println("=====================");
  }

  public boolean buscaCarrinho(ArrayList<ItensCar> itens, int id, int aux){

    for(ItensCar i : itens){
      
      if(i.getIdProduto() == id){
        
        return true;
      }
      
      aux++;
    }

    return false;
  }

  public double getTotal() {
    return total;
  }

  public void setTotal(double total) {
    this.total = total;
  }
  
}