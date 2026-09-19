public class BalletClassFactory implements IDanceClassFactory{
    public IDanceClass createDanceClass(){
        return new BalletClass();
    }
}
