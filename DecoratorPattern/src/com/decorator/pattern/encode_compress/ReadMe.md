1) The application wraps the data source object with a pair of decorators. Both wrappers change the way the data is written to and read from the disk:
2) Just before the data is written to disk, the decorators encrypt and compress it. The original class writes the encrypted and protected data to the file without knowing about the change. 
3) Right after the data is read from disk, it goes through the same decorators, which decompress and decode it. 
4) The decorators and the data source class implement the same interface, which makes them all interchangeable in the client code.

![img.png](EnryptionCompression.png)