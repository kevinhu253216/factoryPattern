public abstract class AbstractMingRenFactory {

    public abstract <T extends MingRen> T createMingRen(Class<T> c);

}
