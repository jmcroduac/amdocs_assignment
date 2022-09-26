package com.training.day8_assignment.playlist;

public class PlaylistQueue {

    int capacity;
    int front;
    int rear;
    int count;
    String arr[];

    PlaylistQueue(int size){
        arr = new String[size];
        this.capacity = size;
        front = 0;
        rear = -1;
        count = 0;
    }

    public void addSong(String item){
        if(count == capacity){
            System.out.println("The song cannot be added. The playlist is full.");
        }else{
            System.out.println("\n\nInserting the song: " + item + "\n\n");
            rear = (rear + 1)%capacity;
            arr[rear] = item;
            count++;
        }
    }

    public void playSong(){
        if(count < 1){
            System.out.println("\n\nThere are no songs in the playlist.\n\n");
        }else{
            String song = arr[front];
            System.out.println("\n\nThe song " + song + " is playing.\n\n");
            front = (front+1)%capacity;
            count--;
        }
    }

    public String peek(){
        return arr[front];
    }

    public void remainingSongs(){
        System.out.println("\n\nThere are " + count + " songs remaining in the playlist.\n\n");
    }
}
