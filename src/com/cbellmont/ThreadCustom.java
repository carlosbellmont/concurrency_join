package com.cbellmont;

class ThreadCustom extends Thread {

    @Override
    public void run() {

        for(int i=0; i<10; i++) {
            ProcessHandle processHandle = ProcessHandle.current();

            System.out.println("Soy la variable ThreadCustom con PID  " + processHandle.pid() + ", pero mi id es " + getId() + ". Estoy en la iteración " + i );
            try {
                sleep( 1000);
            } catch(Exception exception) {
                exception.printStackTrace();
            }
        }

    }

}