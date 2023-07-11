import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
class OptionNotvalid  extends Exception
{
    public OptionNotvalid (String str)
    {
        // calling the constructor of parent Exception
        super(str);
    }
}
    public class Main extends Throwable {

    public static void main(String[] args) throws OptionNotvalid {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter\n 1 for Library Details\n 2 for Book details\n 3 for magazine details");
        int option=scan.nextInt();
        if(option>3 ||option<1) {
            throw new OptionNotvalid("invalid Option");
        }
        LibraryItem l=new LibraryItem();
        Book b=new Book();
        Magazine m=new Magazine();
        switch (option){

            case 1:{System.out.println(l.get());
            break;}
            case 2:{System.out.println(l.get()+" "+b.get());
                break;}
            case 3: {
                System.out.println("Enter your issues");
                String issue = scan.nextLine();
                System.out.println(m.setter(issue));
            }

        }

    }
}