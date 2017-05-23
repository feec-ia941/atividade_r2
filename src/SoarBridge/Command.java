/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package SoarBridge;

/**
 *
 * @author Danilo
 */
public class Command
{
    public enum CommandType
    {
        MOVE,
        GET,
        EAT
    }

    private CommandType commandType;
    private Object commandArgument;


    public Command()
    {
        commandType = null;
        commandArgument = null;
    }

    public Command(CommandType _command)
    {
        commandType = _command;
        switch (commandType)
        {
            case MOVE:
                commandArgument = new CommandMove();
                break;

            case GET:
                commandArgument = new CommandGet();
                break;

            case EAT:
                commandArgument = new CommandEat();
                break;

            default:
                commandArgument = null;
                break;
        }
    }

     /**
     * @return the command
     */
    public CommandType getCommandType()
    {
        return commandType;
    }

    /**
     * @param command the command to set
     */
    public void setCommand(CommandType command)
    {
        this.commandType = command;
    }

    /**
     * @return the commandArgument
    */
    public Object getCommandArgument()
    {
        return commandArgument;
    }

    /**
     * @param commandArgument the commandArgument to set
     */
    public void setCommandArgument(Object commandArgument)
    {
        this.commandArgument = commandArgument;
    }
}
