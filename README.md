
# IPC in Android
Let's talk about IPC.

why IPC required?
In android each application has it's own unique process.

For Example :

1. ParcelG Retailer App ( P1 -> Process 1 )

2. ParcelG Customer App ( P2 -> Process 2 )

if we want to establish communication betweeen 2 applications
(i.e. 2 processes), we can use IPC .

Other way to use IPC is if a single application has more than 1 processes,
then to communicate between those processes, we can use IPC.

( Application whose components such as Activity, Service, Receiver, Provider are run in different processes)


There are 3 methods using which IPC can be performed on android.

a. Broadcast Receiver

b. Messanger

c. AIDL ( Android Interface Definition Language)


When to use  Broadcast Receiver VS Messanger VS AIDL?


Broadcast Receiver : For one way communication, use broadcast receivers.

For 2 way communication, use either Messanger or AIDL.
But there is twist.

Use AIDL only if concurrent operations are required otherwise use Messanger.

![Logo](https://github.com/vinaykumar2197/IPCServer-Android/blob/main/ipc_communication_android.png)


## Authors

- [@Vinaykumar](https://www.github.com/vinaykumar2197)


## Acknowledgements

- [Really thankful to Periha Mirkelam for guidance ](https://github.com/perihanmirkelam)

## License
Copyright 2021 Vinaykumar Mishra

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.


    
