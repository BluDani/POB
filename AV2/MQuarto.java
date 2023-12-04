import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MQuarto{

  public void processamento(ArrayList<Quarto> quartos){

    Scanner sc = new Scanner(System.in);
    int res;

    do{

      System.out.println("\n=====Menu Quartos=====");
      System.out.println("0 - Sair");
      System.out.println("1 - Incluir");
      System.out.println("2 - Excluir");
      System.out.println("3 - Alterar");
      System.out.println("4 - Listar");
      System.out.println("======================");

      System.out.println("\nDigite a opção desejada: ");
      res = sc.nextInt();

      switch(res){

        case 0:
          System.out.println("Saindo...");
          break;

        case 1:
          incluir(quartos);
          break;

        case 2:
          excluir(quartos);
          break;

        case 3:
          alterar(quartos);
          break;

        case 4:
          listar(quartos);
          break;
      }
    }
    while(res != 0);
  }

  public boolean incluir(ArrayList<Quarto> quartos){

    int id = 0;
    String nomeQuarto = "";
    int qtdeCamas = 0;
    boolean temBanheiro = false;
    String EhBanheiro = "";
    String descricao = "";
    boolean validar = false;
    
    Scanner sc = new Scanner(System.in);

    while(!validar){
      
      System.out.println("\nDigite o ID: ");
      id = sc.nextInt();
      sc.nextLine();

      validar = validaId(id);
    }
    
    validar = false;

    while(!validar){

      System.out.println("\nDigite o nome do quarto: ");
      nomeQuarto = sc.nextLine();

      validar = validaNomeQuarto(nomeQuarto);
    }
    
    validar = false;

    while(!validar){

      System.out.println("\nDigite a quantidade de camas: ");
      qtdeCamas = sc.nextInt();

      validar = validaQtdeCamas(qtdeCamas);
    }
    
    validar = false;

    while(!validar){

      System.out.println("\nTem banheiro [true/false]: ");
      EhBanheiro = sc.nextLine();

      validar = validaTemBanheiro(EhBanheiro);
    }
    
    validar = false;

    while(!validar){

      System.out.println("\nDigite a descrição: ");
      descricao = sc.nextLine();

      validar = validaDescricao(descricao);
    }
    

    if(EhBanheiro.equals("true")){
      
      temBanheiro = true;
    }
    else{

      temBanheiro = false;
    }
    
    Quarto quarto = new Quarto(id, nomeQuarto, qtdeCamas, temBanheiro, descricao);
    
    quartos.add(quarto);

    return true;
  }

  public boolean excluir(ArrayList<Quarto> quartos){

    Scanner sc = new Scanner(System.in);

    System.out.println("\nDigite o ID: ");
    int id = sc.nextInt();

    for(Quarto i : quartos){

      if(i.getId() == id){
        
        quartos.remove(i);
        return true;
      }
    }

    System.out.println("\nQuarto não encontrado!");
    return false;
  }

  public boolean alterar(ArrayList<Quarto> quartos){

    String nomeQuarto = "";
    int qtdeCamas = 0;
    boolean temBanheiro = false;
    String EhBanheiro = "";
    String descricao = "";
    boolean validar = false;
    
    Scanner sc = new Scanner(System.in);

    System.out.println("\nDigite o ID: ");
    int id = sc.nextInt();
    sc.nextLine();

    for(Quarto i : quartos){

      if(i.getId() == id){

        while(!validar){

          System.out.println("\nDigite o nome do quarto: ");
          nomeQuarto = sc.nextLine();

          validar = validaNomeQuarto(nomeQuarto);
        }

        validar = false;

        while(!validar){

          System.out.println("\nDigite a quantidade de camas: ");
          qtdeCamas = sc.nextInt();

          validar = validaQtdeCamas(qtdeCamas);
        }

        validar = false;

        while(!validar){

          System.out.println("\nTem banheiro [true/false]: ");
          EhBanheiro = sc.nextLine();

          validar = validaTemBanheiro(EhBanheiro);
        }

        validar = false;

        while(!validar){

          System.out.println("\nDigite a descrição: ");
          descricao = sc.nextLine();

          validar = validaDescricao(descricao);
        }


        if(EhBanheiro.equals("true")){

          temBanheiro = true;
        }
        else{

          temBanheiro = false;
        }

        i.setNomeQuarto(nomeQuarto);
        i.setQtdeCamas(qtdeCamas);
        i.setTemBanheiro(temBanheiro);
        i.setDescricao(descricao);

        return true;
      }
    }

    System.out.println("\nQuarto não encontrado!");
    return false;
  }

  public void listar(ArrayList<Quarto> quartos){

    String res;

    System.out.println("\n=====Lista de Quartos=====");

    for(Quarto i : quartos){

      if(i.getTemBanheiro() == true){
        
        res = "Sim";
      }
      else{
        
        res = "Não";
      }
      
      System.out.println("ID: " + i.getId());
      System.out.println("Nome do quarto: " + i.getNomeQuarto());
      System.out.println("Quantidade de camas: " + i.getQtdeCamas());
      System.out.println("Tem banheiro: " + res);
      System.out.println("Descrição: " + i.getDescricao());

      System.out.println("\n\n");
    }

    System.out.println("==========================");
  }

  public boolean validaId(int id){

    if(id > 0){

      return true;
    }
    else{

      System.out.println("\nID inválido");
      return false;
    }
  }

  public boolean validaNomeQuarto(String nomeQuarto){

    
    Pattern pattern = Pattern.compile("^[a-z]+[\\s][a-z]+$", Pattern.CASE_INSENSITIVE);
    Matcher matcher = pattern.matcher(nomeQuarto);
    boolean matchFound = matcher.find();

    if(!matchFound){

      System.out.println("\nNome inválido");
    }

   return matchFound;
  }

  public boolean validaQtdeCamas(int qtdeCamas){

    if(qtdeCamas > 0){

      return true;
    }
    else{

      System.out.println("\nQuantidade de camas inválida");
      return false;
    }
  }

  public boolean validaTemBanheiro(String temBanheiro){

    if((!temBanheiro.equals("true")) && (!temBanheiro.equals("false"))){


      System.out.println("\nOpção inválida");
      return false;
    }
    else{

      return true;
    }
  }

  //revisar
  public boolean validaDescricao(String descricao){

    Pattern pattern = Pattern.compile("^[a-z]+[\\s][a-z]+$", Pattern.CASE_INSENSITIVE);
    Matcher matcher = pattern.matcher(descricao);
    boolean matchFound = matcher.find();

    if(!matchFound){

      System.out.println("\nDescrição inválida");
    }

   return matchFound;
  }
  
}
