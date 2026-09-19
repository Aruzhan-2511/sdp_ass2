public class Main {
    public static void main(String[] args){
        IDanceClassFactory balletFactory = new BalletClassFactory();
        IDanceClass ballet = balletFactory.createDanceClass();
        ballet.startClass();;

        IDanceClassFactory hipHopFactory = new HipHopClassFactory();
        IDanceClass hipHop = hipHopFactory.createDanceClass();
        hipHop.startClass();
    }
}
