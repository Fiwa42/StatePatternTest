public abstract class AbstractPhase {
    GameContext context;
    Player player;
 
    public AbstractPhase(GameContext context, Player player) {
       this.context = context;
       this.player = player;
    }
 }
 