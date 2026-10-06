import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner entrada = new Scanner(System.in);

        String resultado;

        do { 
            
            System.out.print("Digite uma senha: ");
           
            String senha = entrada.nextLine();
           
            resultado = avaliarSenha(senha);
           
            System.out.println(resultado);
        
        } while (!resultado.equals("SUCESSO: Sua senha passou nos critérios básicos!"));

    
    }

    public static String avaliarSenha(String senha) {

     if  (senha.length() < 8) {
         return "Dica: A snha deve ter no mínimo 8caracteres.";
     }
     
     boolean temNumero = false;

     for (int i = 0; i < senha.length(); i++) {
         
         if (Character.isDigit(senha.charAt(i))) {
             temNumero = true;
             break;
         }
     }

     if (temNumero == false){
         return "Dica: Adicione pelo menos um número à sua senha.";
     }

     String[] senhasObvias = { "12345678", "senha123", "admin123" };

     for (int i = 0; i < senhasObvias.length; i++) {

        if (senha.equals(senhasObvias[i])) {
            return "Alerta: Esta senha é muito comum ou óbvia.";
        }
     }   

     boolean temMaiuscula = false;

     for (int i = 0; i < senha.length(); i++) {

          if (Character.isUpperCase(senha.charAt(i))) {
              temMaiuscula = true;
              break;
          }
     }
     if (temMaiuscula == false) {
        return "Dica: Adicione pelo menos uma letra maiúscula à sua senha.";
      }

        return "SUCESSO: Sua senha passou nos critérios básicos!";
     }
}

