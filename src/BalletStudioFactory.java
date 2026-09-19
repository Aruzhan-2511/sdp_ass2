public class BalletStudioFactory implements IDanceStudioFactory{
    public IDanceClass createDanceClass(){
        return new BalletClass();
    }
    public IDanceOutfit createDanceOutfit(){
        return new BalletOutfit();
    }
}
