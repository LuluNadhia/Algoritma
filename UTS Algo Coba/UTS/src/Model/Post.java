package Model;


import java.util.ArrayList;
import java.util.Scanner;

public class Post {
    public String username;
    public int like;
    public int jmlcommen;
    public String commen;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getLike() {
        return like;
    }

    public void setLike(int like) {
        this.like = like;
    }

    public int getJmlcommen() {
        return jmlcommen;
    }

    public void setJmlcommen(int jmlcommen) {
        this.jmlcommen = jmlcommen;
    }

    public String getCommen() {
        return commen;
    }

    public void setCommen(String commen) {
        this.commen = commen;
    }

    public Post (String usrnm, int lke, int jmlcomen){
        this.username = usrnm;
        this.like = lke;
        this.jmlcommen = jmlcomen;
    }


    public Post(String usrnme, String coment){
        this.username = usrnme;
        this.commen = coment;
    }



    public static void comen(){
        String inptUsername;
        String inptKomen;

        ArrayList<Post> komentarAll = new ArrayList<>();
        Scanner input = new Scanner(System.in);

        System.out.println("Masukan Username : ");
        inptUsername = input.nextLine();
        System.out.println("Masukan Komenmu : ");
        inptKomen = input.nextLine();

        Post komen = new Post(inptUsername,inptKomen);
        komentarAll.add(komen);

    }


}
