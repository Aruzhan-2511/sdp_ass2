public class Main {
    public static void main(String[] args){
        System.out.println("---Factory Method---");
        IDanceClassFactory balletFactory = new BalletClassFactory();
        IDanceClass ballet = balletFactory.createDanceClass();
        ballet.startClass();;

        IDanceClassFactory hipHopFactory = new HipHopClassFactory();
        IDanceClass hipHop = hipHopFactory.createDanceClass();
        hipHop.startClass();
        System.out.println("---Abstract Factory---");
        IDanceStudioFactory balletStudio = new BalletStudioFactory();
        runDanceStudio(balletStudio);
        IDanceStudioFactory hipHopStudio = new HipHopStudioFactory();
        runDanceStudio(hipHopStudio);
    }
    private static void runDanceStudio(IDanceStudioFactory factory){
        IDanceClass danceClass = factory.createDanceClass();
        IDanceOutfit danceOutfit = factory.createDanceOutfit();
        danceClass.startClass();;
        danceOutfit.wearOutfit();
    }
}
