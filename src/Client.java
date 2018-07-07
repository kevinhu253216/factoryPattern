import java.util.AbstractCollection;

public class Client {

    public static void main(String[] args){
        AbstractMingRenFactory mingRenFactory=new MingRenFactory();

        MingRenOfFairy mingRenOFfairy=mingRenFactory.createMingRen(MingRenOfFairy.class);
        mingRenOFfairy.getSpell();
        mingRenOFfairy.getAbility();

        MingRenOfSeparate mingRenOfSeparate=mingRenFactory.createMingRen(MingRenOfSeparate.class);
        mingRenOfSeparate.getSpell();
        mingRenOfSeparate.getAbility();

        MingRenOfSpiral mingRenOfSpiral=mingRenFactory.createMingRen(MingRenOfSpiral.class);
        mingRenOfSpiral.getSpell();
        mingRenOfSpiral.getAbility();

    }

}
