import Model.Post;

import java.util.ArrayList;
import java.util.Scanner;

import static Model.Post.comen;

public class Instagram {

    public static int likeNambah(int like){
        int jumlahLike = like +1;
        return jumlahLike;
    }

    private static void Pilihan(char pilih, int like){
        switch (pilih) {
            case '1' -> likeNambah(like);
            case '2' -> comen();
        }

    }

    private static void PrintCommen(){

    }


    public static void main(String[] args) {
        ArrayList<Post> postingan = new ArrayList<>();

        Post Lulu = new Post("Lulu",21,12);
        postingan.add(Lulu);

        char pilihMenu = 0;
        int loop = 0;
        do {
            System.out.println();
            System.out.println(Lulu.getUsername());
            System.out.println("---------------------");
            System.out.println();
            System.out.println();
            System.out.println("Postingan Lulu");
            System.out.println();
            System.out.println();
            System.out.println("---------------------");
            System.out.println(Lulu.getLike()+" suka");
            System.out.println(Lulu.getJmlcommen()+" commen");
            System.out.println();
            //System.out.println(PrintCommen());


            Scanner pilihanmenu = new Scanner(System.in);
            System.out.println("Menu : ");
            System.out.println("1. Like postingan ini");
            System.out.println("2. Komentari postingan ini");
            System.out.println("Pilihan Anda : ");
            pilihMenu = pilihanmenu.next().charAt(0);

            Pilihan(pilihMenu,Lulu.getLike());
            loop++;

        }while(pilihMenu != 0);


    }
}
