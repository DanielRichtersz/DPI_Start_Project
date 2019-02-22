package rabbitmq;

import javax.swing.*;
import java.util.Map;

public class RabbitMQQueues {

    private final static String clientToBroker = "ClientToBroker";
    private final static String brokerToBank = "BrokerToBank";
    private final static String bankToBroker = "BankToBroker";
    private final static String brokerToClient = "BrokerToClient";

    public static String GetClientToBrokerQueueName() { return clientToBroker; }

    public static String GetBrokerToBankQueueName() {
        return brokerToBank;
    }

    public static String GetBankToBrokerQueueName() {
        return bankToBroker;
    }

    public static String GetBrokerToClientQueueName() {
        return brokerToClient;
    }
}
