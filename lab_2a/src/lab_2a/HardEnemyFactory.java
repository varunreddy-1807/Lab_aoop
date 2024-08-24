package lab_2a;


public class HardEnemyFactory extends EnemyFactory {
 @Override
 public Enemy createEnemy() {
     return new Alien();
 }
}
