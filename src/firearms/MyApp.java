package firearms;


import firearms.magazine.AKMagazine30;
import firearms.magazine.MakarovMagazine8;
import firearms.weapons.Weapon;
import firearms.weapons.assault_rifles.AK74;
import firearms.weapons.handguns.Makarov;

import java.util.List;

public class MyApp {
    public static void main(String[] args) {
//        System.out.println("================= Солдат 1 =================");
//        // Берем в руки автомат
//        AK74 ak74 = new AK74();
//        // Берем в руки магазин на 30 патронов
//        AKMagazine30 akMagazine = new AKMagazine30();
//        // Заряжаем 2 патрона
//        akMagazine.addRound();
//        akMagazine.addRound();
//        // Присоединяем магазин к автомату
//        ak74.addMagazine(akMagazine);
//        ak74.inspectRounds();
//        // Досылаем патрон в патронник и проверяем оставшиеся патроны в магазине
//        ak74.pullChargingHandle();
//        ak74.inspectRounds();
//        ak74.inspectChamber();
//        ak74.inspectCharged();
//        // Снимаем с предохранителя и проверяем режим стрельбы
//        ak74.switchSingleFire();
//        ak74.inspectFireMode();
//        // Жмем на спусковой крючок
//        ak74.pullTheTrigger();
//        // Проверяем патроны в магазине и в патроннике (магазин пуст, патрон в патроннике)
//        ak74.inspectRounds();
//        ak74.inspectChamber();
//        ak74.inspectCharged();
//        // Снова жмем на спусковой крючок
//        ak74.pullTheTrigger();
//        // И снова проверяем патроны в магазине и в патроннике (магазин пуст, патрон в патроннике нет, курок взведен)
//        ak74.inspectRounds();
//        ak74.inspectChamber();
//        ak74.inspectCharged();
//        // И еще раз на спусковой крючок. Выстрела нет, курок больше не взведен. Стельбу закончил.
//        ak74.pullTheTrigger();
//        ak74.inspectRounds();
//        ak74.inspectChamber();
//        ak74.inspectCharged();
//
//        System.out.println("================= Солдат 1 стрельбу закончил =================");
//
//        System.out.println("================= Солдат 2 =================");
//        Makarov makarov = new Makarov();
//        MakarovMagazine8 makarovMagazine8 = new MakarovMagazine8();
//        makarovMagazine8.addRound();
//        makarov.addMagazine(makarovMagazine8);
//        makarov.pullTheTrigger();
//        makarov.switchSingleFire();
//        makarov.pullTheTrigger();
//        makarov.pullChargingHandle();
//        makarov.inspectChamber();
//        makarov.inspectCharged();
//        makarov.inspectRounds();
//        makarov.pullTheTrigger();
//        System.out.println("================= Солдат 2 стрельбу закончил =================");

        Rambo rambo = new Rambo();

        AK74 ak74 = new AK74();
        AKMagazine30 akMagazine30 = new AKMagazine30();
        akMagazine30.reload();
        ak74.addMagazine(akMagazine30);

        Makarov makarov = new Makarov();
        MakarovMagazine8 makarovMagazine8 = new MakarovMagazine8();
        makarovMagazine8.reload();
        makarov.addMagazine(makarovMagazine8);

        Makarov makarov2 = new Makarov();
        MakarovMagazine8 makarovMagazine8_1 = new MakarovMagazine8();
        makarovMagazine8_1.reload();
        makarov2.addMagazine(makarovMagazine8_1);

        List<Weapon> weaponList = List.of(ak74, makarov, makarov2);

        rambo.takeGunBox(weaponList);
        rambo.killThemAll();
    }
}
