package KI.Tymkiv.Lab3;

import java.io.FileNotFoundException;
import java.util.List;
import java.util.logging.Logger;

public class MotorBoat extends RowingBoat implements EngineRunnable {
    private static final Logger LOG = Logger.getLogger(MotorBoat.class.getName());
    /**
     * Constructs a new RowingBoat with an owner, list of
     supplies, and location.
     *
     * @param owner The owner of the boat.
     * @param supplies The supplies on the boat.
     * @param location The initial location of the boat.
     * @throws FileNotFoundException If the log file cannot be
    created or opened.
     */
    public MotorBoat(Person owner, List<Supply> supplies, Location location) throws FileNotFoundException {
        super(owner, supplies, location);
    }
    @Override
    public void printBoatSummary() {
        LOG.info("just a cool motor boat, hell yeah!!");
    }
    @Override
    public void startEngine() {
        LOG.info("Engine Started");
    }
    @Override
    public void stopEngine() {
        LOG.info("Engine Stopped");
    }
    @Override
    public void close() throws Exception {
        super.close();
        stopEngine();
    }
}