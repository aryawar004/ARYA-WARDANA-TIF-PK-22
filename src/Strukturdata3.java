import java.util.Scanner;
public class Strukturdata3 {
    static Scanner in=new Scanner(System.in);
    public void insert(node a, int b){
        if(b<a.value){
            if(a.left!=null) insert(a.left,b);
            else{
                a.left=new node();
                a.left.input(b);
                System.out.println(b+" di kiri  "+a.value);
            }
        }
        else if(b>a.value){
            if(a.right!=null) insert(a.right,b);
            else{
                a.right=new node();
                a.right.input(b);
                System.out.println(b+" di kanan "+a.value);
            }
        }
    }
    public void view(node a){
        System.out.print("Pre Order  : ");
        preOrder(a);
        System.out.println(" ");
    }
    public void preOrder(node a){
        if(a!=null){
            System.out.print(a.value+" ");
            preOrder(a.left);
            preOrder(a.right);
        }
    }
}

class node{
    node left,right;
    int value;
    public void input(int a){
        value=a;
    }
    public static void main(String[] args){
        Strukturdata3 tr=new Strukturdata3();
        node root=new node();
        int menu=1;
        int r=1;
        int a;
        while(menu!=3){
            System.out.print("1.masukan\n2.tampilkan\n3.keluar\n : ");
            menu=tr.in.nextInt();
            if(menu==1){
                System.out.print("Masukkan Angka : ");
                a=tr.in.nextInt();
                if(r==1){
                    root.input(a);
                    r--;
                }
                else tr.insert(root,a);
            }
            else if(menu==2) tr.view(root);
            else if(menu==3) System.out.println("Keluar");
            else System.out.println("Salah");
            System.out.println(" ");
        }
    }
}