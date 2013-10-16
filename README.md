Coherence Event Processing : MemberListener

Coherence manages cluster membership, automatically adding new servers to the cluster when they start up and automatically detecting their departure when they are shut down or fail. Applications have full access to this information, and can sign up to receive event notifications when members join and leave the cluster. Coherence also tracks all the services that each member is providing and consuming, and uses this information to plan for service resiliency in case of server failure, and to load-balance data management and other responsibilities across all members of the cluster.

<strong>com.tangosol.net.MemberListener</strong> Interface has been exposed in order to handle cluster' s member events. MemberEvent.MEMBER_JOINED, MemberEvent.MEMBER_LEAVING and MemberEvent.MEMBER_LEFT Events can be handled by enabling this interface.

<strong>MemberListener API details :</strong>

<strong>void memberJoined(MemberEvent evt) :</strong> Invoked when a Member has joined the service.

<strong>void memberLeaving(MemberEvent evt) :</strong> Invoked when a Member is leaving the service.

<strong>void memberLeft(MemberEvent evt) :</strong>  Invoked when a Member has left the service.

There are two ways to enable MemberListener feature :

1) <strong>Programmatic-based :</strong> A <strong>MemberListener</strong> can be registered to <strong>CacheService</strong> programmatically as the following :

```html

	Service service = cache.getCacheService();
	service.addMemberListener(package.MyMemberListener);

```

2) <strong>Configuration-based :</strong> The <strong>member-listener</strong> configuration can be added to the coherence-cache-config.xml file as the following :

```html

	<distributed-scheme>
	   <scheme-name>example-distributed</scheme-name>
	   <service-name>DistributedCache</service-name>
	   <strong>
	   <member-listener>
		  <class-name>package.MyMemberListener</class-name>
	   </member-listener>
	   </strong>
	   <backing-map-scheme>
		  <local-scheme>
			 <scheme-ref>example-binary-backing-map</scheme-ref>
		  </local-scheme>
	   </backing-map-scheme>
	   <autostart>true</autostart>
	</distributed-scheme>

```

In the following sample application, MemberListener functionality is implemented by following the second way. 

<strong>Used Technologies :</strong>

JDK 1.7.0_40
Spring 3.2.4
Coherence 3.7.1
Maven 3.0.4
