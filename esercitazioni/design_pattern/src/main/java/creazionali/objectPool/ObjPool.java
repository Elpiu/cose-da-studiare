package creazionali.objectPool;


public class ObjPool extends ObjectPool<SuperExpensiveObject>{

    @Override
    protected SuperExpensiveObject create() {
        return new SuperExpensiveObject();
    }
}
