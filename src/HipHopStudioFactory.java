public class HipHopStudioFactory implements IDanceStudioFactory{
    public IDanceClass createDanceClass(){
        return new HipHopClass();
    }
    public IDanceOutfit createDanceOutfit(){
        return new HipHopOutfit();
    }
}
