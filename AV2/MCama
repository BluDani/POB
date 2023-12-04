import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MCama{

  public void processamento(ArrayList<Cama> camas){

    Scanner sc = new Scanner(System.in);
    int res;

    do{
      
      System.out.println("\n=====Menu Camas=====");
      System.out.println("0 - Sair");
      System.out.println("1 - Incluir");
      System.out.println("2 - Excluir");
      System.out.println("3 - Alterar");
      System.out.println("4 - Listar");
      System.out.println("====================");

      System.out.println("\nDigite a opção desejada: ");
      res = sc.nextInt();

      switch(res){

        case 0:
          System.out.println("Saindo...");
          break;

        case 1:
          incluir(camas);
          break;

        case 2:
          excluir(camas);
          break;

        case 3:
          alterar(camas);
          break;

        case 4:
          listar(camas);
          break;
      }
    }
    while(res != 0);
  }

  public boolean incluir(ArrayList<Cama> camas){

    int id = 0;
    int codigo = 0;
    Boolean beliche = false;
    String posicao = "";
    String descricao = "";
    String EhBeliche = "";
    boolean validar = false;

    Scanner sc = new Scanner(System.in);

    while(!validar){
      
      System.out.println("\nDigite o ID: ");
      id = sc.nextInt();

      validar = validaId(id);
    }

    validar = false;
    
    while(!validar){
      
      System.out.println("\nDigite o codigo da cama: ");
      codigo = sc.nextInt();
      sc.nextLine();

      validar = validaCodigoCama(codigo);
    }

    validar = false;

    while(!validar){
      
      System.out.println("\nÉ beliche [true/false]: ");
      EhBeliche = sc.nextLine();

      validar = validaBeliche(EhBeliche);
    }

    validar = false;

    while(!validar){

      System.out.println("\nDigite a posição: ");
      posicao = sc.nextLine();

      validar = validaPosicao(posicao);
    }

    validar = false;

    while(!validar){

      System.out.println("\nDigite a descrição: ");
      descricao = sc.nextLine();

      validar = validaDescricao(descricao);
    }

    if(EhBeliche.equals("true")){
      
      beliche = true;
    }
    else{

      beliche = false;
    }
    
    Cama cama = new Cama(id, codigo, beliche, posicao, descricao);

    camas.add(cama);

    return true;
  }

  public boolean excluir(ArrayList<Cama> camas){

    Scanner sc = new Scanner(System.in);

    System.out.println("\nDigite o ID: ");
    int id = sc.nextInt();

    for(Cama i : camas){

      if(i.getId() == id){
        
        camas.remove(i);
        return true;
      }
    }

    System.out.println("\nCama não encontrada!");
    return false;
  }

  public boolean alterar(ArrayList<Cama> camas){

    int codigo = 0;
    Boolean beliche = false;
    String posicao = "";
    String descricao = "";
    String EhBeliche = "";
    boolean validar = false;

    Scanner sc = new Scanner(System.in);

    System.out.println("\nDigite o ID: ");
    int id = sc.nextInt();

    for(Cama i : camas){

      if(i.getId() == id){

        while(!validar){

          System.out.println("\nDigite o codigo da cama: ");
          codigo = sc.nextInt();
          sc.nextLine();

          validar = validaCodigoCama(codigo);
        }

        validar = false;

        while(!validar){

          System.out.println("\nÉ beliche [true/false]: ");
          EhBeliche = sc.nextLine();

          System.out.println("valor " + EhBeliche);
          validar = validaBeliche(EhBeliche);
        }

        validar = false;

        while(!validar){

          System.out.println("\nDigite a posição: ");
          posicao = sc.nextLine();

          validar = validaPosicao(posicao);
        }

        validar = false;

        while(!validar){

          System.out.println("\nDigite a descrição: ");
          descricao = sc.nextLine();

          validar = validaDescricao(descricao);
        }

        if(EhBeliche.equals("true")){

          beliche = true;
        }
        else{

          beliche = false;
        }

        i.setCodigoCama(codigo);
        i.setEhBeliche(beliche);
        i.setPosicao(posicao);
        i.setDescricao(descricao);

        return true;
      }
    }

    System.out.println("\nCama não encontrada!");
    return false;
  }

  public void listar(ArrayList<Cama> camas){

    String res;

    System.out.println("\n=====Lista de Camas=====");

    for(Cama i : camas){

      if(i.getEhBeliche() == true){
        
        res = "Sim";
      }
      else{
        
        res = "Não";
      }

      System.out.println("ID: " + i.getId());
      System.out.println("Codigo da cama: " + i.getCodigoCama());
      System.out.println("É beliche: " + res);
      System.out.println("Posição: " + i.getPosicao());
      System.out.println("Descrição: " + i.getDescricao());

      System.out.println("\n\n");
    }

    System.out.println("=======================");
  }

  public boolean validaId(int id){

    if(id > 0){
      
      return true;
    }
    else{

      System.out.println("ID inválido");
      return false;
    }
  }

  public boolean validaCodigoCama(int codigoCama){

    if(codigoCama > 0){
      
      return true;
    }
    else{

      System.out.println("Código da cama inválido");
      return false;
    }
  }

  public boolean validaBeliche(String beliche){

    if((!beliche.equals("true")) && (!beliche.equals("false"))){
      
      System.out.println("Valor inválido");
      return false;
    }
    else{

      return true;
    }
  }

  //revisar essas funções depois
  public boolean validaPosicao(String posicao){

    Pattern pattern = Pattern.compile("^[a-z]+[\\s][a-z]+$", Pattern.CASE_INSENSITIVE);
    Matcher matcher = pattern.matcher(posicao);
    boolean matchFound = matcher.find();
    
    if(!matchFound){
      
      System.out.println("Posição inválida");
    }
    
   return matchFound;
  }

  //revisar
  public boolean validaDescricao(String descricao){

    Pattern pattern = Pattern.compile("^[a-z]+[\\s][a-z]+$", Pattern.CASE_INSENSITIVE);
      Matcher matcher = pattern.matcher(descricao);
      boolean matchFound = matcher.find();

      if(!matchFound){

        System.out.println("Descrição inválida");
      }

     return matchFound;
  }
}
