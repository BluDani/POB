import java.util.ArrayList;
import java.util.Scanner;

public class Menu {

  private ArrayList<Produto> produtos = new ArrayList<>();
  Carrinho carrinho = new Carrinho();

  public void processamento(){

    Produto produto1 = new Produto(01, "chocolate", 4);
    produtos.add(produto1);

    Produto produto2 = new Produto(02, "Fini", 5);
    produtos.add(produto2);

    Produto produto3 = new Produto(03, "amendoim", 2);
    produtos.add(produto3);

    listarProduto(produtos);
    
    Scanner sc = new Scanner(System.in);

    System.out.println("1 - Adicionar no carrinho");
    System.out.println("2 - Concluir compra");

    int res = 1;

    do{

        System.out.println("\nO que deseja fazer: ");
        res = sc.nextInt();

        switch(res){

          case 1: 
            carrinho.incluirCarrinho(produtos);
            break;

          case 2:
            carrinho.listarCarrinho(produtos);
            System.exit(0);
            break;
        }

    }
    while(res != 2);

  }

  //Ajeitar a parte de inserir nome
  public Boolean incluirProduto(){

    int id;
    String nome = "";
    double valor;

    Scanner sc = new Scanner(System.in);

    System.out.println("\nDigite o ID: ");
    id = sc.nextInt();

    System.out.println("Digite o nome: ");
    nome = sc.nextLine();

    System.out.println("Digite o valor: ");
    valor = sc.nextDouble();

    Produto produto = new Produto(id, nome, valor);
    produtos.add(produto);

    return true;
  }
  
  public void listarProduto(ArrayList<Produto> produtos){
    
    for(Produto produto : produtos){

      System.out.println("ID: " + produto.getId());
      System.out.println("Nome: " + produto.getNome());
      System.out.print("Preço: " + produto.getValor() + "\n\n");
    }
  }
}