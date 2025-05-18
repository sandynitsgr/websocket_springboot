# Chat App end-to-end
## Overview
This is a DIY project to develop an android chat application along with learning on-the-go to get better hands-on in Springboot backend as well.
Since Java-Kotlin are interoperable and Kotlin is already being used at many places for backend and for other platforms like iOS (Kotlin multiplatform, Compose multiplatform), I think its good time to build something from scratch using Kotlin completely.

*This whole project is for learning purpose so suggestions are welcome considering no overcomplication is involved.*

### Backend - Spring boot + AWS S3/Firebase (NoSQL) + PostgreSQL + message queue (maybe Kafka)....
### Android - Kotlin + MVVM with Repository pattern at Model layer + Jetpack Compose + Room + Glide + Paging3 + Navigation + Dagger
This is a basic sample backend in Spring boot that will act as a base for our Android chat application. We will try to minimally change the backend as we go futher to support the core functionalities of a chat app.

In this iteration we are making the server to respond with the same message whatever client will send. So if one user sends a message, server will broadcast it to all the connected users to this websocket endpoint.
So essentially its one-to-many chat model.

As we move further we will add authentication, authorization, one-to-one chat functionality, and will use some free DBs like:
postgreSQL(for structured data like user info and messages and most probably Firebase(most likely) or AWS S3(1st year free??) as a Blob store for attachments(For now lets say only image is supported).
Focus will be more on Android app but whatever bare minimum will be needed from a backend to fulfill the below requirements, we will add those changes here.
My focus won't be too much on high class performance for backend code but if I find it necessary, I will add corresponding changes to it.



