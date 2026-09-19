public class HipHopClassFactory implements IDanceClassFactory{
    public IDanceClass createDanceClass(){
        return new HipHopClass();
    }
}
