public class Cache {
    Integer[] array;
    Integer subtractor = null;
    RAM ram;

    public Cache(Integer lenght, RAM ram) {
        this.array = new Integer[lenght];
        this.ram = ram;
    }

    public Integer get(int address) {
        if(subtractor == null ||address < this.subtractor || address > this.subtractor + (this.array.length - 1)){
            if(address > ram.getLenght() - array.length){
                for (int i = 0; i < this.array.length; ++i){
                    //tr-tc
                    if(address + i <= this.ram.getLenght())
                        this.array[i] = ram.get(ram.getLenght() - array.length + i);
                }

                this.subtractor = ram.getLenght() - array.length;

            } else {
                for (int i = 0; i < this.array.length; ++i){
                    //tr-tc
                    if(address + i <= this.ram.getLenght())
                        this.array[i] = ram.get(address + i);
                }
                this.subtractor = address;
            }

        }


        return array[address-subtractor];

    }

    public void set(int position, int word) {
        this.ram.set(position,word);
    }
}