package ro.pub.cs.systems.eim.lab05.startedservice.service;

import android.content.Context;
import android.content.Intent;

import ro.pub.cs.systems.eim.lab05.startedservice.general.Constants;

public class ProcessingThreads extends Thread {

    private Context context;

    public ProcessingThread(Context context) {
        this.context = context;
    }

    @override
    public void run() {
        while (true) {
            sendMessage(Constants.MESSAGE_STRING);
            sleep();
            sendMessage(Constants.MESSAGE_INTEGER);
            sleep();
            sendMessage(Constants.MESSAGE_ARRAY_LIST);
            sleep();
        }
    }

    private void sleep() {
        try {
            Thread.sleep(Constants.SLEEP_TIME);
        } catch (InterruptedException interruptedException) {
            interruptedException.printStackTrace();
        }
    }

    private void sendMessage(int messageType) {
        Intent intent = new Intent();
        switch (messageType) {
            case Constants.MESSAGE_STRING:
                intent.setAction(Constants.ACTION_STRING);
                intent.putExtra(Constants.DATA, Constants.STRING_DATA);
                break;
            case Constants.MESSAGE_INTEGER:
                intent.setAction(Constants.ACTION_STRING);
                intent.putExtra(Constants.DATA, Constants.STRING_DATA);
                break;
            case Constants.MESSAGE_ARRAY_LIST:
                intent.setAction(Constants.ACTION_STRING);
                intent.putExtra(Constants.DATA, Constants.STRING_DATA);
                break;
        }
    }
}