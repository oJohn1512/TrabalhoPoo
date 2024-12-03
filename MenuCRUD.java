import service.CrudGenerico;
import java.util.Scanner;
import java.util.List;


public class MenuCRUD {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CrudGenerico<Object> crud = new CrudGenerico<>();
        boolean sair = false;

        while (!sair) {
            System.out.println("\n--- MENU PRINCIPAL ---");
            System.out.println("1. Selecionar Classe");
            System.out.println("2. Sair");
            System.out.println("----------------------");
            System.out.print("Escolha uma opção: ");
            int opcaoMenu = scanner.nextInt();
            scanner.nextLine(); // Consumir quebra de linha

            switch (opcaoMenu) {
                case 1:
                    String nomeArquivo = selecionarClasse(scanner);
                    if (nomeArquivo != null) {
                        menuCRUD(scanner, crud, nomeArquivo);
                    }
                    break;
                case 2:
                    System.out.println("Saindo...");
                    sair = true;
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }
        }
        scanner.close();
    }

    private static String selecionarClasse(Scanner classeEscolhida) {
        System.out.println("\n----- CLASSES DISPONÍVEIS -----");
        System.out.println("1. Assento         7. Ingresso");
        System.out.println("2. Ator            8. Pessoa");
        System.out.println("3. Filme           9. Sala");
        System.out.println("4. FilmeAtor       10. SalaAssento");
        System.out.println("5. Funcionario     11. Sessao");
        System.out.println("6. Genero          12. TipoAssento");
        System.out.println("13. Voltar ao Menu Principal");
        System.out.println("--------------------------------");
        System.out.print("Escolha uma classe: ");

        int arquivoClasse = classeEscolhida.nextInt();
        classeEscolhida.nextLine();

        switch (arquivoClasse) {
            case 1: return "Assento.txt";
            case 2: return "Ator.txt";
            case 3: return "Filme.txt";
            case 4: return "FilmeAtor.txt";
            case 5: return "Funcionario.txt";
            case 6: return "Genero.txt";
            case 7: return "Ingresso.txt";
            case 8: return "Pessoa.txt";
            case 9: return "Sala.txt";
            case 10: return "SalaAssento.txt";
            case 11: return "Sessao.txt";
            case 12: return "TipoAssento.txt";
            case 13: return null; // Voltar ao menu principal
            default:
                System.out.println("Opção inválida! Tente novamente.");
                return null;
        }
    }

    private static void menuCRUD(Scanner scanner, CrudGenerico<Object> crud, String nomeArquivo) {
        boolean sair = false;

        while (!sair) {
            System.out.println("\n------- MENU CRUD -------");
            System.out.println("1. Cadastrar");
            System.out.println("2. Atualizar registro");
            System.out.println("3. Listar todos os registros");
            System.out.println("4. Consultar registro por ID");
            System.out.println("5. Voltar ao Menu Principal");
            System.out.println("---------------------------");
            System.out.print("Escolha uma opção: ");

            int opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    cadastrar(crud, scanner, nomeArquivo);
                    break;
                case 2:
                    editar(crud,scanner,nomeArquivo);
                    break;
                case 3:
                    listar(crud, nomeArquivo);
                    break;
                case 4:
                    consultar(crud, scanner, nomeArquivo);
                    break;
                case 5:
                    System.out.println("Voltando ao menu principal...");
                    sair = true;
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }
        }
    }

    private static void cadastrar(CrudGenerico<Object> crud, Scanner scanner, String nomeArquivo) {
        System.out.print("Digite os dados do objeto: ");
        String objeto = scanner.nextLine();
        crud.cadastrar(objeto, nomeArquivo);
    }

    private static void listar(CrudGenerico<Object> crud, String nomeArquivo) {
        List<String> registros = crud.listar(nomeArquivo);
        System.out.println("\n--- Registros ---");
        for (String registro : registros) {
            System.out.println(registro);
        }
    }

    private static void consultar(CrudGenerico<Object> crud, Scanner scanner, String nomeArquivo) {
        System.out.print("Digite o ID do registro que deseja consultar: ");
        int id = scanner.nextInt();
        scanner.nextLine(); // Consumir a quebra de linha
        crud.consultar(id, nomeArquivo);
    }

    private static void editar(CrudGenerico<Object> crud, Scanner scanner, String nomeArquivo){
        System.out.print("Digite o ID do registro que deseja atualizar: ");
        int id = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Digite as novas informações do registro: ");
        String objeto = scanner.nextLine();
        crud.editar(id,objeto,nomeArquivo);
    }
}

