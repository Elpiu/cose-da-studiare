package creazionali.objectPool;

public class Pool {


    public static void main(String[] args) {
        ObjPool pool = new ObjPool();
        System.out.println(pool.toString());
        //Usiamo 3 oggetti
        SuperExpensiveObject o1 = pool.checkOut();
        SuperExpensiveObject o2 = pool.checkOut();
        SuperExpensiveObject o3 = pool.checkOut();
        System.out.println(o1.getId());
        System.out.println(o2.getId());
        System.out.println(o3.getId());
        System.out.println(pool.toString());
        //sbarazziamoci del secondo
        pool.checkIn(o2);
        System.out.println(pool.toString());
        //richiediamo un oggetto
        SuperExpensiveObject o4 = pool.checkOut();
        System.out.println(o4.getId());
    }



}
