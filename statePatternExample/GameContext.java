import java.util.ArrayList;
import java.util.List;

public class GameContext {
   private TurnPhase actionphase;
   private TurnPhase drawPhase;
   private TurnPhase infectionPhase;
   private final List<Player> players = new ArrayList();
   private Player currentPlayer;
   private TurnPhase currentTurnPhase;

   public GameContext(List<Player> players) {
      this.players.addAll(players);
      this.currentPlayer = (Player)this.players.removeFirst();
      this.instantiatePhases();
      this.currentTurnPhase = this.actionphase;
   }

   public void setPhase(TurnPhase turnPhase) {
      this.currentTurnPhase = turnPhase;
   }

   public TurnPhase getActionPhase() {
      return this.actionphase;
   }

   public TurnPhase getDrawPhase() {
      return this.drawPhase;
   }

   public TurnPhase getInfectionPhase() {
      return this.infectionPhase;
   }

   public void endTurn() {
      this.players.addLast(this.currentPlayer);
      this.currentPlayer = (Player)this.players.removeFirst();
      this.instantiatePhases();
   }

   public void operate() {
      this.currentTurnPhase.operate();
   }

   private void instantiatePhases() {
      this.actionphase = new ActionPhase(this, this.currentPlayer);
      this.drawPhase = new DrawPhase(this, this.currentPlayer);
      this.infectionPhase = new InfectionPhase(this, this.currentPlayer);
   }
}
