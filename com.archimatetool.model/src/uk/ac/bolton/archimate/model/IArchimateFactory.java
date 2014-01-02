/**
 * This program and the accompanying materials
 * are made available under the terms of the License
 * which accompanies this distribution in the file LICENSE.txt
 */
package uk.ac.bolton.archimate.model;

import org.eclipse.emf.ecore.EFactory;


/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see uk.ac.bolton.archimate.model.IArchimatePackage
 * @generated
 */
public interface IArchimateFactory extends EFactory {
    /**
     * The singleton instance of the factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    IArchimateFactory eINSTANCE = uk.ac.bolton.archimate.model.impl.ArchimateFactory.init();

    /**
     * Returns a new object of class '<em>Property</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Property</em>'.
     * @generated
     */
    IProperty createProperty();

    /**
     * Returns a new object of class '<em>Model</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Model</em>'.
     * @generated
     */
    IArchimateModel createArchimateModel();

    /**
     * Returns a new object of class '<em>Folder</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Folder</em>'.
     * @generated
     */
    IFolder createFolder();

    /**
     * Returns a new object of class '<em>Business Activity</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Business Activity</em>'.
     * @generated
     */
    IBusinessActivity createBusinessActivity();

    /**
     * Returns a new object of class '<em>Business Actor</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Business Actor</em>'.
     * @generated
     */
    IBusinessActor createBusinessActor();

    /**
     * Returns a new object of class '<em>Business Collaboration</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Business Collaboration</em>'.
     * @generated
     */
    IBusinessCollaboration createBusinessCollaboration();

    /**
     * Returns a new object of class '<em>Contract</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Contract</em>'.
     * @generated
     */
    IContract createContract();

    /**
     * Returns a new object of class '<em>Business Event</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Business Event</em>'.
     * @generated
     */
    IBusinessEvent createBusinessEvent();

    /**
     * Returns a new object of class '<em>Business Function</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Business Function</em>'.
     * @generated
     */
    IBusinessFunction createBusinessFunction();

    /**
     * Returns a new object of class '<em>Business Interaction</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Business Interaction</em>'.
     * @generated
     */
    IBusinessInteraction createBusinessInteraction();

    /**
     * Returns a new object of class '<em>Business Interface</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Business Interface</em>'.
     * @generated
     */
    IBusinessInterface createBusinessInterface();

    /**
     * Returns a new object of class '<em>Meaning</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Meaning</em>'.
     * @generated
     */
    IMeaning createMeaning();

    /**
     * Returns a new object of class '<em>Business Object</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Business Object</em>'.
     * @generated
     */
    IBusinessObject createBusinessObject();

    /**
     * Returns a new object of class '<em>Business Process</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Business Process</em>'.
     * @generated
     */
    IBusinessProcess createBusinessProcess();

    /**
     * Returns a new object of class '<em>Product</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Product</em>'.
     * @generated
     */
    IProduct createProduct();

    /**
     * Returns a new object of class '<em>Representation</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Representation</em>'.
     * @generated
     */
    IRepresentation createRepresentation();

    /**
     * Returns a new object of class '<em>Business Role</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Business Role</em>'.
     * @generated
     */
    IBusinessRole createBusinessRole();

    /**
     * Returns a new object of class '<em>Business Service</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Business Service</em>'.
     * @generated
     */
    IBusinessService createBusinessService();

    /**
     * Returns a new object of class '<em>Value</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Value</em>'.
     * @generated
     */
    IValue createValue();

    /**
     * Returns a new object of class '<em>Location</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Location</em>'.
     * @generated
     */
    ILocation createLocation();

    /**
     * Returns a new object of class '<em>Application Component</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Application Component</em>'.
     * @generated
     */
    IApplicationComponent createApplicationComponent();

    /**
     * Returns a new object of class '<em>Application Function</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Application Function</em>'.
     * @generated
     */
    IApplicationFunction createApplicationFunction();

    /**
     * Returns a new object of class '<em>Application Interaction</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Application Interaction</em>'.
     * @generated
     */
    IApplicationInteraction createApplicationInteraction();

    /**
     * Returns a new object of class '<em>Application Interface</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Application Interface</em>'.
     * @generated
     */
    IApplicationInterface createApplicationInterface();

    /**
     * Returns a new object of class '<em>Data Object</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Data Object</em>'.
     * @generated
     */
    IDataObject createDataObject();

    /**
     * Returns a new object of class '<em>Application Service</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Application Service</em>'.
     * @generated
     */
    IApplicationService createApplicationService();

    /**
     * Returns a new object of class '<em>Artifact</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Artifact</em>'.
     * @generated
     */
    IArtifact createArtifact();

    /**
     * Returns a new object of class '<em>Communication Path</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Communication Path</em>'.
     * @generated
     */
    ICommunicationPath createCommunicationPath();

    /**
     * Returns a new object of class '<em>Network</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Network</em>'.
     * @generated
     */
    INetwork createNetwork();

    /**
     * Returns a new object of class '<em>Infrastructure Interface</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Infrastructure Interface</em>'.
     * @generated
     */
    IInfrastructureInterface createInfrastructureInterface();

    /**
     * Returns a new object of class '<em>Infrastructure Service</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Infrastructure Service</em>'.
     * @generated
     */
    IInfrastructureService createInfrastructureService();

    /**
     * Returns a new object of class '<em>Infrastructure Function</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Infrastructure Function</em>'.
     * @generated
     */
    IInfrastructureFunction createInfrastructureFunction();

    /**
     * Returns a new object of class '<em>Node</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Node</em>'.
     * @generated
     */
    INode createNode();

    /**
     * Returns a new object of class '<em>System Software</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>System Software</em>'.
     * @generated
     */
    ISystemSoftware createSystemSoftware();

    /**
     * Returns a new object of class '<em>Device</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Device</em>'.
     * @generated
     */
    IDevice createDevice();

    /**
     * Returns a new object of class '<em>Stakeholder</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Stakeholder</em>'.
     * @generated
     */
    IStakeholder createStakeholder();

    /**
     * Returns a new object of class '<em>Driver</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Driver</em>'.
     * @generated
     */
    IDriver createDriver();

    /**
     * Returns a new object of class '<em>Assessment</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Assessment</em>'.
     * @generated
     */
    IAssessment createAssessment();

    /**
     * Returns a new object of class '<em>Goal</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Goal</em>'.
     * @generated
     */
    IGoal createGoal();

    /**
     * Returns a new object of class '<em>Requirement</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Requirement</em>'.
     * @generated
     */
    IRequirement createRequirement();

    /**
     * Returns a new object of class '<em>Constraint</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Constraint</em>'.
     * @generated
     */
    IConstraint createConstraint();

    /**
     * Returns a new object of class '<em>Principle</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Principle</em>'.
     * @generated
     */
    IPrinciple createPrinciple();

    /**
     * Returns a new object of class '<em>Work Package</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Work Package</em>'.
     * @generated
     */
    IWorkPackage createWorkPackage();

    /**
     * Returns a new object of class '<em>Deliverable</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Deliverable</em>'.
     * @generated
     */
    IDeliverable createDeliverable();

    /**
     * Returns a new object of class '<em>Plateau</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Plateau</em>'.
     * @generated
     */
    IPlateau createPlateau();

    /**
     * Returns a new object of class '<em>Gap</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Gap</em>'.
     * @generated
     */
    IGap createGap();

    /**
     * Returns a new object of class '<em>Diagram Model</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Diagram Model</em>'.
     * @generated
     */
    IArchimateDiagramModel createArchimateDiagramModel();

    /**
     * Returns a new object of class '<em>Diagram Model Reference</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Diagram Model Reference</em>'.
     * @generated
     */
    IDiagramModelReference createDiagramModelReference();

    /**
     * Returns a new object of class '<em>Diagram Model Archimate Object</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Diagram Model Archimate Object</em>'.
     * @generated
     */
    IDiagramModelArchimateObject createDiagramModelArchimateObject();

    /**
     * Returns a new object of class '<em>Diagram Model Group</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Diagram Model Group</em>'.
     * @generated
     */
    IDiagramModelGroup createDiagramModelGroup();

    /**
     * Returns a new object of class '<em>Diagram Model Note</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Diagram Model Note</em>'.
     * @generated
     */
    IDiagramModelNote createDiagramModelNote();

    /**
     * Returns a new object of class '<em>Diagram Model Image</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Diagram Model Image</em>'.
     * @generated
     */
    IDiagramModelImage createDiagramModelImage();

    /**
     * Returns a new object of class '<em>Diagram Model Connection</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Diagram Model Connection</em>'.
     * @generated
     */
    IDiagramModelConnection createDiagramModelConnection();

    /**
     * Returns a new object of class '<em>Diagram Model Archimate Connection</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Diagram Model Archimate Connection</em>'.
     * @generated
     */
    IDiagramModelArchimateConnection createDiagramModelArchimateConnection();

    /**
     * Returns a new object of class '<em>Diagram Model Bendpoint</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Diagram Model Bendpoint</em>'.
     * @generated
     */
    IDiagramModelBendpoint createDiagramModelBendpoint();

    /**
     * Returns a new object of class '<em>Bounds</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Bounds</em>'.
     * @generated
     */
    IBounds createBounds();
    
    /**
     * Returns a new object of class '<em>Sketch Model</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Sketch Model</em>'.
     * @generated
     */
    ISketchModel createSketchModel();

    /**
     * Returns a new object of class '<em>Sketch Model Sticky</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Sketch Model Sticky</em>'.
     * @generated
     */
    ISketchModelSticky createSketchModelSticky();

    /**
     * Returns a new object of class '<em>Sketch Model Actor</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Sketch Model Actor</em>'.
     * @generated
     */
    ISketchModelActor createSketchModelActor();

    /**
     * Create a new Bounds object
     * @param x
     * @param y
     * @param width
     * @param height
     * @return
     */
    IBounds createBounds(int x, int y, int width, int height);

    /**
     * Returns a new object of class '<em>Application Collaboration</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Application Collaboration</em>'.
     * @generated
     */
    IApplicationCollaboration createApplicationCollaboration();

    /**
     * Returns a new object of class '<em>Junction</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Junction</em>'.
     * @generated
     */
    IJunction createJunction();

    /**
     * Returns a new object of class '<em>And Junction</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>And Junction</em>'.
     * @generated
     */
    IAndJunction createAndJunction();

    /**
     * Returns a new object of class '<em>Or Junction</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Or Junction</em>'.
     * @generated
     */
    IOrJunction createOrJunction();

    /**
     * Returns a new object of class '<em>Access Relationship</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Access Relationship</em>'.
     * @generated
     */
    IAccessRelationship createAccessRelationship();

    /**
     * Returns a new object of class '<em>Aggregation Relationship</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Aggregation Relationship</em>'.
     * @generated
     */
    IAggregationRelationship createAggregationRelationship();

    /**
     * Returns a new object of class '<em>Assignment Relationship</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Assignment Relationship</em>'.
     * @generated
     */
    IAssignmentRelationship createAssignmentRelationship();

    /**
     * Returns a new object of class '<em>Association Relationship</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Association Relationship</em>'.
     * @generated
     */
    IAssociationRelationship createAssociationRelationship();

    /**
     * Returns a new object of class '<em>Composition Relationship</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Composition Relationship</em>'.
     * @generated
     */
    ICompositionRelationship createCompositionRelationship();

    /**
     * Returns a new object of class '<em>Flow Relationship</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Flow Relationship</em>'.
     * @generated
     */
    IFlowRelationship createFlowRelationship();

    /**
     * Returns a new object of class '<em>Realisation Relationship</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Realisation Relationship</em>'.
     * @generated
     */
    IRealisationRelationship createRealisationRelationship();

    /**
     * Returns a new object of class '<em>Specialisation Relationship</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Specialisation Relationship</em>'.
     * @generated
     */
    ISpecialisationRelationship createSpecialisationRelationship();

    /**
     * Returns a new object of class '<em>Triggering Relationship</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Triggering Relationship</em>'.
     * @generated
     */
    ITriggeringRelationship createTriggeringRelationship();

    /**
     * Returns a new object of class '<em>Used By Relationship</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Used By Relationship</em>'.
     * @generated
     */
    IUsedByRelationship createUsedByRelationship();

    /**
     * Returns a new object of class '<em>Influence Relationship</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Influence Relationship</em>'.
     * @generated
     */
    IInfluenceRelationship createInfluenceRelationship();

    /**
     * Returns the package supported by this factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the package supported by this factory.
     * @generated
     */
    IArchimatePackage getArchimatePackage();

} //IArchimateFactory