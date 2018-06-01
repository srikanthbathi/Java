Java provides automatic memory managemnt using GC - garbage collector 

Live object - that is refered by some object in our application.

Dead object - unreachable object.

References from old object to young object only exist in small numbers 

-> We cnnot force gc to happen (System.gc())

-> RunTime error - outOf memory error

-------------------GC involves----------------------------------- 

Mark: Starts from root node of your application, walks the object graph, marks objects that are reachable as alive.

Delete/Sweep: Deleat unreachable objects

Compacting: Compact the memory by moving around the objects and making the allocation contiguous that fragmented.



--------------------Generational Collectors------------


Young generation is the space were objects are initially created initially 
      -- Eden space new objects created
      -- Survivor space from - like when Eden space gets filled then gc pitch in to remove all the unreachable objects in eden space and moves the reachable objects to survivor space making eden space to new objets.
      -- Survivor space to


Old(Tenured) generation -- survived for long time

Minor GC runs across Young generation
Major GC runs across Heap 
Major and Minor both causes pause in your application

For example if the objects are survived for some threashold they ll move to old geration.   --XX:MaxTenuringThreshold
if old generation becomes full thn the major GC will pitch in.



---------------------Performance--------------------------


Responsiveness/latency -- how fast the application responds for a requested data.

Throughput-- focuses on maximizing the amount of work bt any application in a specific period of time.
High pause time is accetable for applications that focus on throughput.



-----------------different types of GC--------------------

--serial collector ---- :  that runs in single thread, 


---- cocurrent collector--

a thread that performs gc along with the application execution as the application runs, does not wait for old generation to be full- stops the world only during mark/re mark


--parallel--   use multiple cpus to perform gc. multiple threads perform mark and sweep. does not kick in until heap is full or nearly full


concurrent/parallel

Threre is more memory/high number of cpus/Application demands shory pauses

less memory
less number of cpus
Application demand high throughput





-----------------------G1 GC-------- frm java 1.7

garbage first

It straddles the young-tenured generation boundary as it divides heap in to different regions and during a GC it divides heap in to different regions and during a GC it can collect a sub-set of regions.
it dynamically select a set of region to act as young generation in next gc cycle.
Regions with most garbage will be collected first.
   More predictable GC pauses
   Low pauses with fragmentation
   parallelism and concurrency together
   Better heat utilization




   using given gc in our application 

   -XX:+UseSerialGC
   -XX:+UseParallelGC   -- Young generation uses parallel /old will use single 
   -XX:+UseParallelOldGC  -- both uses parallel
   -XX:+UseParNewGC
   -XX:+UseConcMarkSweepGC
   -XX:+UseG1GC


Tune the heap

-Xmsvalue 
-Xmxvalue
-XX:NewRation= ratio(2 means 1/3Y + 2/3 T)
--XX:NewSize = size
-XX:MaxNewSize = size
-XXperm:PermSize


GC logging 

-verbose:gc
-XX:+PrintGCDetails
-Xloggc:gc.log
visual-vm


jvisualvm

with visual gc plugin













