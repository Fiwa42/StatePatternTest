import java.util.ArrayList;
import java.util.List;

public class GameManagement {
   public GameManagement() {
   }

   public static void main(String[] args) {
      Player player_a = new Player("Player A");
      Player player_b = new Player("Player B");
      Player player_c = new Player("Player C");
      List<Player> players = new ArrayList();
      players.add(player_a);
      players.add(player_b);
      players.add(player_c);
      GameContext context = new GameContext(players);

      for(int i = 0; i < 27; ++i) {
         context.operate();
      }

   }
}
