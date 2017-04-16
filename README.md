# COMP373: Bridge-Pattern Louie + Adil Project 3

#Class Notes:
Definition: You can use a bridge to 'decouple an abstraction from its
implementation so that the two can vary independently'.
The Bridge Pattern can be used to provide multiple implementations
under the same interface.

Example of a Bridge Pattern: In a bridge design pattern there are
2 layers; the abstraction layer and implementation layer. If you make
any changes in the implementation layer, it would not effect anything
in the abstraction layer, and same vice versa.
So suppose the abstraction layer is sending a message to someone.
So in the implementation layer, you can send a SMS to someone or an
email to someone. So the abstraction will use one of the two implementations
to send the message and they are 'independent'. If you wanted to add a
third implementation method to send a message you can without it effecting the
abstraction layer.

#Supporting Document(s)
https://www.tutorialspoint.com/design_pattern/bridge_pattern.htm
Good Resource W/basic definition and implementation steps.

https://sourcemaking.com/design_patterns/bridge
Really liked the example and checklist.

https://www.youtube.com/watch?v=X76vtWBM09U
Good overview of the Bridge Pattern with examples and consequences of
implementing it.
