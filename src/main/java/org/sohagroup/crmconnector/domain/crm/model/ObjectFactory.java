
package org.sohagroup.crmconnector.domain.crm.model;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.datatype.Duration;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each Java content interface and Java element interface generated in the
 * org.sohagroup.crmconnector.domain.crm.model package. &lt;p&gt;An ObjectFactory allows you to programatically
 * construct new instances of the Java representation for XML content. The Java representation of XML content can
 * consist of schema derived interfaces and classes representing the binding of schema type definitions, element
 * declarations and model groups.  Factory methods for each of these are provided in this class.
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _AnyType_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/",
        "anyType");
    private final static QName _AnyURI_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/",
        "anyURI");
    private final static QName _Base64Binary_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/",
        "base64Binary");
    private final static QName _Boolean_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/",
        "boolean");
    private final static QName _Byte_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "byte");
    private final static QName _DateTime_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/",
        "dateTime");
    private final static QName _Decimal_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/",
        "decimal");
    private final static QName _Double_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/",
        "double");
    private final static QName _Float_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "float");
    private final static QName _Int_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "int");
    private final static QName _Long_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "long");
    private final static QName _QName_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "QName");
    private final static QName _Short_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "short");
    private final static QName _String_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/",
        "string");
    private final static QName _UnsignedByte_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/",
        "unsignedByte");
    private final static QName _UnsignedInt_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/",
        "unsignedInt");
    private final static QName _UnsignedLong_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/",
        "unsignedLong");
    private final static QName _UnsignedShort_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/",
        "unsignedShort");
    private final static QName _Char_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "char");
    private final static QName _Duration_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/",
        "duration");
    private final static QName _Guid_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "guid");
    private final static QName _Entity_QNAME = new QName("http://schemas.microsoft.com/xrm/2011/Contracts", "Entity");
    private final static QName _AttributeCollection_QNAME = new QName("http://schemas.microsoft.com/xrm/2011/Contracts",
        "AttributeCollection");
    private final static QName _Money_QNAME = new QName("http://schemas.microsoft.com/xrm/2011/Contracts", "Money");
    private final static QName _ArrayOfMoney_QNAME = new QName("http://schemas.microsoft.com/xrm/2011/Contracts",
        "ArrayOfMoney");
    private final static QName _EntityReference_QNAME = new QName("http://schemas.microsoft.com/xrm/2011/Contracts",
        "EntityReference");
    private final static QName _ArrayOfEntityReference_QNAME = new QName(
        "http://schemas.microsoft.com/xrm/2011/Contracts", "ArrayOfEntityReference");
    private final static QName _OptionSetValue_QNAME = new QName("http://schemas.microsoft.com/xrm/2011/Contracts",
        "OptionSetValue");
    private final static QName _ArrayOfOptionSetValue_QNAME = new QName(
        "http://schemas.microsoft.com/xrm/2011/Contracts", "ArrayOfOptionSetValue");
    private final static QName _EntityCollection_QNAME = new QName("http://schemas.microsoft.com/xrm/2011/Contracts",
        "EntityCollection");
    private final static QName _ArrayOfEntity_QNAME = new QName("http://schemas.microsoft.com/xrm/2011/Contracts",
        "ArrayOfEntity");
    private final static QName _Label_QNAME = new QName("http://schemas.microsoft.com/xrm/2011/Contracts", "Label");
    private final static QName _LocalizedLabelCollection_QNAME = new QName(
        "http://schemas.microsoft.com/xrm/2011/Contracts", "LocalizedLabelCollection");
    private final static QName _LocalizedLabel_QNAME = new QName("http://schemas.microsoft.com/xrm/2011/Contracts",
        "LocalizedLabel");
    private final static QName _BooleanManagedProperty_QNAME = new QName(
        "http://schemas.microsoft.com/xrm/2011/Contracts", "BooleanManagedProperty");
    private final static QName _ManagedPropertyboolean_QNAME = new QName(
        "http://schemas.microsoft.com/xrm/2011/Contracts", "ManagedPropertyboolean");
    private final static QName _ManagedPropertyAttributeRequiredLevel_QNAME = new QName(
        "http://schemas.microsoft.com/xrm/2011/Contracts", "ManagedPropertyAttributeRequiredLevel");
    private final static QName _AliasedValue_QNAME = new QName("http://schemas.microsoft.com/xrm/2011/Contracts",
        "AliasedValue");
    private final static QName _ColumnSet_QNAME = new QName("http://schemas.microsoft.com/xrm/2011/Contracts",
        "ColumnSet");
    private final static QName _EntityReferenceCollection_QNAME = new QName(
        "http://schemas.microsoft.com/xrm/2011/Contracts", "EntityReferenceCollection");
    private final static QName _QueryBase_QNAME = new QName("http://schemas.microsoft.com/xrm/2011/Contracts",
        "QueryBase");
    private final static QName _QueryExpression_QNAME = new QName("http://schemas.microsoft.com/xrm/2011/Contracts",
        "QueryExpression");
    private final static QName _FilterExpression_QNAME = new QName("http://schemas.microsoft.com/xrm/2011/Contracts",
        "FilterExpression");
    private final static QName _ArrayOfConditionExpression_QNAME = new QName(
        "http://schemas.microsoft.com/xrm/2011/Contracts", "ArrayOfConditionExpression");
    private final static QName _ConditionExpression_QNAME = new QName("http://schemas.microsoft.com/xrm/2011/Contracts",
        "ConditionExpression");
    private final static QName _ConditionOperator_QNAME = new QName("http://schemas.microsoft.com/xrm/2011/Contracts",
        "ConditionOperator");
    private final static QName _LogicalOperator_QNAME = new QName("http://schemas.microsoft.com/xrm/2011/Contracts",
        "LogicalOperator");
    private final static QName _ArrayOfFilterExpression_QNAME = new QName(
        "http://schemas.microsoft.com/xrm/2011/Contracts", "ArrayOfFilterExpression");
    private final static QName _ArrayOfLinkEntity_QNAME = new QName("http://schemas.microsoft.com/xrm/2011/Contracts",
        "ArrayOfLinkEntity");
    private final static QName _LinkEntity_QNAME = new QName("http://schemas.microsoft.com/xrm/2011/Contracts",
        "LinkEntity");
    private final static QName _JoinOperator_QNAME = new QName("http://schemas.microsoft.com/xrm/2011/Contracts",
        "JoinOperator");
    private final static QName _ArrayOfOrderExpression_QNAME = new QName(
        "http://schemas.microsoft.com/xrm/2011/Contracts", "ArrayOfOrderExpression");
    private final static QName _OrderExpression_QNAME = new QName("http://schemas.microsoft.com/xrm/2011/Contracts",
        "OrderExpression");
    private final static QName _OrderType_QNAME = new QName("http://schemas.microsoft.com/xrm/2011/Contracts",
        "OrderType");
    private final static QName _PagingInfo_QNAME = new QName("http://schemas.microsoft.com/xrm/2011/Contracts",
        "PagingInfo");
    private final static QName _QueryByAttribute_QNAME = new QName("http://schemas.microsoft.com/xrm/2011/Contracts",
        "QueryByAttribute");
    private final static QName _FetchExpression_QNAME = new QName("http://schemas.microsoft.com/xrm/2011/Contracts",
        "FetchExpression");
    private final static QName _ArrayOfQueryExpression_QNAME = new QName(
        "http://schemas.microsoft.com/xrm/2011/Contracts", "ArrayOfQueryExpression");
    private final static QName _ArrayOfLocalizedLabel_QNAME = new QName(
        "http://schemas.microsoft.com/xrm/2011/Contracts", "ArrayOfLocalizedLabel");
    private final static QName _Relationship_QNAME = new QName("http://schemas.microsoft.com/xrm/2011/Contracts",
        "Relationship");
    private final static QName _EntityRole_QNAME = new QName("http://schemas.microsoft.com/xrm/2011/Contracts",
        "EntityRole");
    private final static QName _AttributePrivilegeCollection_QNAME = new QName(
        "http://schemas.microsoft.com/xrm/2011/Contracts", "AttributePrivilegeCollection");
    private final static QName _AttributePrivilege_QNAME = new QName("http://schemas.microsoft.com/xrm/2011/Contracts",
        "AttributePrivilege");
    private final static QName _RelationshipQueryCollection_QNAME = new QName(
        "http://schemas.microsoft.com/xrm/2011/Contracts", "RelationshipQueryCollection");
    private final static QName _EntityMetadataCollection_QNAME = new QName(
        "http://schemas.microsoft.com/xrm/2011/Contracts", "EntityMetadataCollection");
    private final static QName _OrganizationRequest_QNAME = new QName("http://schemas.microsoft.com/xrm/2011/Contracts",
        "OrganizationRequest");
    private final static QName _ParameterCollection_QNAME = new QName("http://schemas.microsoft.com/xrm/2011/Contracts",
        "ParameterCollection");
    private final static QName _OrganizationServiceFault_QNAME = new QName(
        "http://schemas.microsoft.com/xrm/2011/Contracts", "OrganizationServiceFault");
    private final static QName _BaseServiceFault_QNAME = new QName("http://schemas.microsoft.com/xrm/2011/Contracts",
        "BaseServiceFault");
    private final static QName _ErrorDetailCollection_QNAME = new QName(
        "http://schemas.microsoft.com/xrm/2011/Contracts", "ErrorDetailCollection");
    private final static QName _DiscoveryServiceFault_QNAME = new QName(
        "http://schemas.microsoft.com/xrm/2011/Contracts", "DiscoveryServiceFault");
    private final static QName _OrganizationResponse_QNAME = new QName(
        "http://schemas.microsoft.com/xrm/2011/Contracts", "OrganizationResponse");
    private final static QName _QuickFindResultCollection_QNAME = new QName(
        "http://schemas.microsoft.com/xrm/2011/Contracts", "QuickFindResultCollection");
    private final static QName _QuickFindResult_QNAME = new QName("http://schemas.microsoft.com/xrm/2011/Contracts",
        "QuickFindResult");
    private final static QName _AttributeMappingCollection_QNAME = new QName(
        "http://schemas.microsoft.com/xrm/2011/Contracts", "AttributeMappingCollection");
    private final static QName _EntityState_QNAME = new QName("http://schemas.microsoft.com/xrm/2011/Contracts",
        "EntityState");
    private final static QName _FormattedValueCollection_QNAME = new QName(
        "http://schemas.microsoft.com/xrm/2011/Contracts", "FormattedValueCollection");
    private final static QName _RelatedEntityCollection_QNAME = new QName(
        "http://schemas.microsoft.com/xrm/2011/Contracts", "RelatedEntityCollection");
    private final static QName _KeyValuePairOfstringanyType_QNAME = new QName(
        "http://schemas.datacontract.org/2004/07/System.Collections.Generic", "KeyValuePairOfstringanyType");
    private final static QName _KeyValuePairOfRelationshipQueryBaseXPsK4FkN_QNAME = new QName(
        "http://schemas.datacontract.org/2004/07/System.Collections.Generic",
        "KeyValuePairOfRelationshipQueryBaseX_PsK4FkN");
    private final static QName _KeyValuePairOfDeletedMetadataFiltersArrayOfguidPlUvPKtF_QNAME = new QName(
        "http://schemas.datacontract.org/2004/07/System.Collections.Generic",
        "KeyValuePairOfDeletedMetadataFiltersArrayOfguidPlUv_PKtF");
    private final static QName _KeyValuePairOfEndpointTypestringyDL0RVHi_QNAME = new QName(
        "http://schemas.datacontract.org/2004/07/System.Collections.Generic",
        "KeyValuePairOfEndpointTypestringyDL0RVHi");
    private final static QName _ArrayOfKeyValuePairOfstringanyType_QNAME = new QName(
        "http://schemas.datacontract.org/2004/07/System.Collections.Generic", "ArrayOfKeyValuePairOfstringanyType");
    private final static QName _KeyValuePairOfstringQueryBasegUGIFE1S_QNAME = new QName(
        "http://schemas.datacontract.org/2004/07/System.Collections.Generic", "KeyValuePairOfstringQueryBasegUGIFE1S");
    private final static QName _KeyValuePairOfstringstring_QNAME = new QName(
        "http://schemas.datacontract.org/2004/07/System.Collections.Generic", "KeyValuePairOfstringstring");
    private final static QName _KeyValuePairOfRelationshipEntityCollectionXPsK4FkN_QNAME = new QName(
        "http://schemas.datacontract.org/2004/07/System.Collections.Generic",
        "KeyValuePairOfRelationshipEntityCollectionX_PsK4FkN");
    private final static QName _ArrayOfboolean_QNAME = new QName(
        "http://schemas.microsoft.com/2003/10/Serialization/Arrays", "ArrayOfboolean");
    private final static QName _ArrayOfint_QNAME = new QName(
        "http://schemas.microsoft.com/2003/10/Serialization/Arrays", "ArrayOfint");
    private final static QName _ArrayOfstring_QNAME = new QName(
        "http://schemas.microsoft.com/2003/10/Serialization/Arrays", "ArrayOfstring");
    private final static QName _ArrayOfArrayOfstring_QNAME = new QName(
        "http://schemas.microsoft.com/2003/10/Serialization/Arrays", "ArrayOfArrayOfstring");
    private final static QName _ArrayOfdouble_QNAME = new QName(
        "http://schemas.microsoft.com/2003/10/Serialization/Arrays", "ArrayOfdouble");
    private final static QName _ArrayOfdecimal_QNAME = new QName(
        "http://schemas.microsoft.com/2003/10/Serialization/Arrays", "ArrayOfdecimal");
    private final static QName _ArrayOfguid_QNAME = new QName(
        "http://schemas.microsoft.com/2003/10/Serialization/Arrays", "ArrayOfguid");
    private final static QName _ArrayOfdateTime_QNAME = new QName(
        "http://schemas.microsoft.com/2003/10/Serialization/Arrays", "ArrayOfdateTime");
    private final static QName _ArrayOfKeyValueOfstringstring_QNAME = new QName(
        "http://schemas.microsoft.com/2003/10/Serialization/Arrays", "ArrayOfKeyValueOfstringstring");
    private final static QName _ArrayOfanyType_QNAME = new QName(
        "http://schemas.microsoft.com/2003/10/Serialization/Arrays", "ArrayOfanyType");
    private final static QName _ArrayOfKeyValueOfintstring_QNAME = new QName(
        "http://schemas.microsoft.com/2003/10/Serialization/Arrays", "ArrayOfKeyValueOfintstring");
    private final static QName _MetadataBase_QNAME = new QName("http://schemas.microsoft.com/xrm/2011/Metadata",
        "MetadataBase");
    private final static QName _RelationshipMetadataBase_QNAME = new QName(
        "http://schemas.microsoft.com/xrm/2011/Metadata", "RelationshipMetadataBase");
    private final static QName _AttributeRequiredLevel_QNAME = new QName(
        "http://schemas.microsoft.com/xrm/2011/Metadata", "AttributeRequiredLevel");
    private final static QName _SecurityTypes_QNAME = new QName("http://schemas.microsoft.com/xrm/2011/Metadata",
        "SecurityTypes");
    private final static QName _RelationshipType_QNAME = new QName("http://schemas.microsoft.com/xrm/2011/Metadata",
        "RelationshipType");
    private final static QName _OneToManyRelationshipMetadata_QNAME = new QName(
        "http://schemas.microsoft.com/xrm/2011/Metadata", "OneToManyRelationshipMetadata");
    private final static QName _AssociatedMenuConfiguration_QNAME = new QName(
        "http://schemas.microsoft.com/xrm/2011/Metadata", "AssociatedMenuConfiguration");
    private final static QName _AssociatedMenuBehavior_QNAME = new QName(
        "http://schemas.microsoft.com/xrm/2011/Metadata", "AssociatedMenuBehavior");
    private final static QName _AssociatedMenuGroup_QNAME = new QName("http://schemas.microsoft.com/xrm/2011/Metadata",
        "AssociatedMenuGroup");
    private final static QName _CascadeConfiguration_QNAME = new QName("http://schemas.microsoft.com/xrm/2011/Metadata",
        "CascadeConfiguration");
    private final static QName _CascadeType_QNAME = new QName("http://schemas.microsoft.com/xrm/2011/Metadata",
        "CascadeType");
    private final static QName _ManyToManyRelationshipMetadata_QNAME = new QName(
        "http://schemas.microsoft.com/xrm/2011/Metadata", "ManyToManyRelationshipMetadata");
    private final static QName _AttributeMetadata_QNAME = new QName("http://schemas.microsoft.com/xrm/2011/Metadata",
        "AttributeMetadata");
    private final static QName _AttributeTypeCode_QNAME = new QName("http://schemas.microsoft.com/xrm/2011/Metadata",
        "AttributeTypeCode");
    private final static QName _AttributeRequiredLevelManagedProperty_QNAME = new QName(
        "http://schemas.microsoft.com/xrm/2011/Metadata", "AttributeRequiredLevelManagedProperty");
    private final static QName _DateTimeAttributeMetadata_QNAME = new QName(
        "http://schemas.microsoft.com/xrm/2011/Metadata", "DateTimeAttributeMetadata");
    private final static QName _DateTimeFormat_QNAME = new QName("http://schemas.microsoft.com/xrm/2011/Metadata",
        "DateTimeFormat");
    private final static QName _ImeMode_QNAME = new QName("http://schemas.microsoft.com/xrm/2011/Metadata", "ImeMode");
    private final static QName _PicklistAttributeMetadata_QNAME = new QName(
        "http://schemas.microsoft.com/xrm/2011/Metadata", "PicklistAttributeMetadata");
    private final static QName _EnumAttributeMetadata_QNAME = new QName(
        "http://schemas.microsoft.com/xrm/2011/Metadata", "EnumAttributeMetadata");
    private final static QName _OptionSetMetadata_QNAME = new QName("http://schemas.microsoft.com/xrm/2011/Metadata",
        "OptionSetMetadata");
    private final static QName _OptionSetMetadataBase_QNAME = new QName(
        "http://schemas.microsoft.com/xrm/2011/Metadata", "OptionSetMetadataBase");
    private final static QName _OptionSetType_QNAME = new QName("http://schemas.microsoft.com/xrm/2011/Metadata",
        "OptionSetType");
    private final static QName _BooleanOptionSetMetadata_QNAME = new QName(
        "http://schemas.microsoft.com/xrm/2011/Metadata", "BooleanOptionSetMetadata");
    private final static QName _OptionMetadata_QNAME = new QName("http://schemas.microsoft.com/xrm/2011/Metadata",
        "OptionMetadata");
    private final static QName _StatusOptionMetadata_QNAME = new QName("http://schemas.microsoft.com/xrm/2011/Metadata",
        "StatusOptionMetadata");
    private final static QName _StateOptionMetadata_QNAME = new QName("http://schemas.microsoft.com/xrm/2011/Metadata",
        "StateOptionMetadata");
    private final static QName _EntityNameAttributeMetadata_QNAME = new QName(
        "http://schemas.microsoft.com/xrm/2011/Metadata", "EntityNameAttributeMetadata");
    private final static QName _StateAttributeMetadata_QNAME = new QName(
        "http://schemas.microsoft.com/xrm/2011/Metadata", "StateAttributeMetadata");
    private final static QName _StatusAttributeMetadata_QNAME = new QName(
        "http://schemas.microsoft.com/xrm/2011/Metadata", "StatusAttributeMetadata");
    private final static QName _LookupAttributeMetadata_QNAME = new QName(
        "http://schemas.microsoft.com/xrm/2011/Metadata", "LookupAttributeMetadata");
    private final static QName _BooleanAttributeMetadata_QNAME = new QName(
        "http://schemas.microsoft.com/xrm/2011/Metadata", "BooleanAttributeMetadata");
    private final static QName _DecimalAttributeMetadata_QNAME = new QName(
        "http://schemas.microsoft.com/xrm/2011/Metadata", "DecimalAttributeMetadata");
    private final static QName _DoubleAttributeMetadata_QNAME = new QName(
        "http://schemas.microsoft.com/xrm/2011/Metadata", "DoubleAttributeMetadata");
    private final static QName _ManagedPropertyAttributeMetadata_QNAME = new QName(
        "http://schemas.microsoft.com/xrm/2011/Metadata", "ManagedPropertyAttributeMetadata");
    private final static QName _IntegerAttributeMetadata_QNAME = new QName(
        "http://schemas.microsoft.com/xrm/2011/Metadata", "IntegerAttributeMetadata");
    private final static QName _IntegerFormat_QNAME = new QName("http://schemas.microsoft.com/xrm/2011/Metadata",
        "IntegerFormat");
    private final static QName _BigIntAttributeMetadata_QNAME = new QName(
        "http://schemas.microsoft.com/xrm/2011/Metadata", "BigIntAttributeMetadata");
    private final static QName _MemoAttributeMetadata_QNAME = new QName(
        "http://schemas.microsoft.com/xrm/2011/Metadata", "MemoAttributeMetadata");
    private final static QName _StringFormat_QNAME = new QName("http://schemas.microsoft.com/xrm/2011/Metadata",
        "StringFormat");
    private final static QName _MoneyAttributeMetadata_QNAME = new QName(
        "http://schemas.microsoft.com/xrm/2011/Metadata", "MoneyAttributeMetadata");
    private final static QName _StringAttributeMetadata_QNAME = new QName(
        "http://schemas.microsoft.com/xrm/2011/Metadata", "StringAttributeMetadata");
    private final static QName _EntityMetadata_QNAME = new QName("http://schemas.microsoft.com/xrm/2011/Metadata",
        "EntityMetadata");
    private final static QName _ArrayOfAttributeMetadata_QNAME = new QName(
        "http://schemas.microsoft.com/xrm/2011/Metadata", "ArrayOfAttributeMetadata");
    private final static QName _ArrayOfManyToManyRelationshipMetadata_QNAME = new QName(
        "http://schemas.microsoft.com/xrm/2011/Metadata", "ArrayOfManyToManyRelationshipMetadata");
    private final static QName _ArrayOfOneToManyRelationshipMetadata_QNAME = new QName(
        "http://schemas.microsoft.com/xrm/2011/Metadata", "ArrayOfOneToManyRelationshipMetadata");
    private final static QName _OwnershipTypes_QNAME = new QName("http://schemas.microsoft.com/xrm/2011/Metadata",
        "OwnershipTypes");
    private final static QName _ArrayOfSecurityPrivilegeMetadata_QNAME = new QName(
        "http://schemas.microsoft.com/xrm/2011/Metadata", "ArrayOfSecurityPrivilegeMetadata");
    private final static QName _SecurityPrivilegeMetadata_QNAME = new QName(
        "http://schemas.microsoft.com/xrm/2011/Metadata", "SecurityPrivilegeMetadata");
    private final static QName _PrivilegeType_QNAME = new QName("http://schemas.microsoft.com/xrm/2011/Metadata",
        "PrivilegeType");
    private final static QName _ArrayOfOptionMetadata_QNAME = new QName(
        "http://schemas.microsoft.com/xrm/2011/Metadata", "ArrayOfOptionMetadata");
    private final static QName _ArrayOfEntityMetadata_QNAME = new QName(
        "http://schemas.microsoft.com/xrm/2011/Metadata", "ArrayOfEntityMetadata");
    private final static QName _ArrayOfRelationshipMetadataBase_QNAME = new QName(
        "http://schemas.microsoft.com/xrm/2011/Metadata", "ArrayOfRelationshipMetadataBase");
    private final static QName _EntityFilters_QNAME = new QName("http://schemas.microsoft.com/xrm/2011/Metadata",
        "EntityFilters");
    private final static QName _ArrayOfOptionSetMetadataBase_QNAME = new QName(
        "http://schemas.microsoft.com/xrm/2011/Metadata", "ArrayOfOptionSetMetadataBase");
    private final static QName _ManagedPropertyMetadata_QNAME = new QName(
        "http://schemas.microsoft.com/xrm/2011/Metadata", "ManagedPropertyMetadata");
    private final static QName _ManagedPropertyEvaluationPriority_QNAME = new QName(
        "http://schemas.microsoft.com/xrm/2011/Metadata", "ManagedPropertyEvaluationPriority");
    private final static QName _ManagedPropertyType_QNAME = new QName("http://schemas.microsoft.com/xrm/2011/Metadata",
        "ManagedPropertyType");
    private final static QName _ManagedPropertyOperation_QNAME = new QName(
        "http://schemas.microsoft.com/xrm/2011/Metadata", "ManagedPropertyOperation");
    private final static QName _ArrayOfManagedPropertyMetadata_QNAME = new QName(
        "http://schemas.microsoft.com/xrm/2011/Metadata", "ArrayOfManagedPropertyMetadata");
    private final static QName _ArrayOfStringFormat_QNAME = new QName("http://schemas.microsoft.com/xrm/2011/Metadata",
        "ArrayOfStringFormat");
    private final static QName _ArrayOfAttributeRequiredLevel_QNAME = new QName(
        "http://schemas.microsoft.com/xrm/2011/Metadata", "ArrayOfAttributeRequiredLevel");
    private final static QName _ArrayOfAttributeTypeCode_QNAME = new QName(
        "http://schemas.microsoft.com/xrm/2011/Metadata", "ArrayOfAttributeTypeCode");
    private final static QName _ArrayOfCascadeType_QNAME = new QName("http://schemas.microsoft.com/xrm/2011/Metadata",
        "ArrayOfCascadeType");
    private final static QName _ArrayOfDateTimeFormat_QNAME = new QName(
        "http://schemas.microsoft.com/xrm/2011/Metadata", "ArrayOfDateTimeFormat");
    private final static QName _ArrayOfIntegerFormat_QNAME = new QName("http://schemas.microsoft.com/xrm/2011/Metadata",
        "ArrayOfIntegerFormat");
    private final static QName _ArrayOfManagedPropertyEvaluationPriority_QNAME = new QName(
        "http://schemas.microsoft.com/xrm/2011/Metadata", "ArrayOfManagedPropertyEvaluationPriority");
    private final static QName _ArrayOfManagedPropertyOperation_QNAME = new QName(
        "http://schemas.microsoft.com/xrm/2011/Metadata", "ArrayOfManagedPropertyOperation");
    private final static QName _ArrayOfManagedPropertyType_QNAME = new QName(
        "http://schemas.microsoft.com/xrm/2011/Metadata", "ArrayOfManagedPropertyType");
    private final static QName _ArrayOfSecurityTypes_QNAME = new QName("http://schemas.microsoft.com/xrm/2011/Metadata",
        "ArrayOfSecurityTypes");
    private final static QName _ArrayOfOwnershipTypes_QNAME = new QName(
        "http://schemas.microsoft.com/xrm/2011/Metadata", "ArrayOfOwnershipTypes");
    private final static QName _ArrayOfImeMode_QNAME = new QName("http://schemas.microsoft.com/xrm/2011/Metadata",
        "ArrayOfImeMode");
    private final static QName _ArrayOfRelationshipType_QNAME = new QName(
        "http://schemas.microsoft.com/xrm/2011/Metadata", "ArrayOfRelationshipType");
    private final static QName _AttributeTypeDisplayName_QNAME = new QName(
        "http://schemas.microsoft.com/xrm/2013/Metadata", "AttributeTypeDisplayName");
    private final static QName _ConstantsBase_QNAME = new QName("http://schemas.microsoft.com/xrm/2013/Metadata",
        "ConstantsBase");
    private final static QName _StringFormatName_QNAME = new QName("http://schemas.microsoft.com/xrm/2013/Metadata",
        "StringFormatName");
    private final static QName _ImageAttributeMetadata_QNAME = new QName(
        "http://schemas.microsoft.com/xrm/2013/Metadata", "ImageAttributeMetadata");
    private final static QName _ArrayOfAttributeTypeDisplayName_QNAME = new QName(
        "http://schemas.microsoft.com/xrm/2013/Metadata", "ArrayOfAttributeTypeDisplayName");
    private final static QName _EndpointAccessType_QNAME = new QName("http://schemas.microsoft.com/xrm/2014/Contracts",
        "EndpointAccessType");
    private final static QName _AttributeMapping_QNAME = new QName("http://schemas.microsoft.com/xrm/2014/Contracts",
        "AttributeMapping");
    private final static QName _OrganizationDetail_QNAME = new QName("http://schemas.microsoft.com/xrm/2014/Contracts",
        "OrganizationDetail");
    private final static QName _EndpointCollection_QNAME = new QName("http://schemas.microsoft.com/xrm/2014/Contracts",
        "EndpointCollection");
    private final static QName _EndpointType_QNAME = new QName("http://schemas.microsoft.com/xrm/2014/Contracts",
        "EndpointType");
    private final static QName _OrganizationState_QNAME = new QName("http://schemas.microsoft.com/xrm/2014/Contracts",
        "OrganizationState");
    private final static QName _MetadataFilterExpression_QNAME = new QName(
        "http://schemas.microsoft.com/xrm/2011/Metadata/Query", "MetadataFilterExpression");
    private final static QName _ArrayOfMetadataConditionExpression_QNAME = new QName(
        "http://schemas.microsoft.com/xrm/2011/Metadata/Query", "ArrayOfMetadataConditionExpression");
    private final static QName _MetadataConditionExpression_QNAME = new QName(
        "http://schemas.microsoft.com/xrm/2011/Metadata/Query", "MetadataConditionExpression");
    private final static QName _MetadataConditionOperator_QNAME = new QName(
        "http://schemas.microsoft.com/xrm/2011/Metadata/Query", "MetadataConditionOperator");
    private final static QName _ArrayOfMetadataFilterExpression_QNAME = new QName(
        "http://schemas.microsoft.com/xrm/2011/Metadata/Query", "ArrayOfMetadataFilterExpression");
    private final static QName _MetadataQueryBase_QNAME = new QName(
        "http://schemas.microsoft.com/xrm/2011/Metadata/Query", "MetadataQueryBase");
    private final static QName _MetadataQueryExpression_QNAME = new QName(
        "http://schemas.microsoft.com/xrm/2011/Metadata/Query", "MetadataQueryExpression");
    private final static QName _MetadataPropertiesExpression_QNAME = new QName(
        "http://schemas.microsoft.com/xrm/2011/Metadata/Query", "MetadataPropertiesExpression");
    private final static QName _RelationshipQueryExpression_QNAME = new QName(
        "http://schemas.microsoft.com/xrm/2011/Metadata/Query", "RelationshipQueryExpression");
    private final static QName _EntityQueryExpression_QNAME = new QName(
        "http://schemas.microsoft.com/xrm/2011/Metadata/Query", "EntityQueryExpression");
    private final static QName _AttributeQueryExpression_QNAME = new QName(
        "http://schemas.microsoft.com/xrm/2011/Metadata/Query", "AttributeQueryExpression");
    private final static QName _LabelQueryExpression_QNAME = new QName(
        "http://schemas.microsoft.com/xrm/2011/Metadata/Query", "LabelQueryExpression");
    private final static QName _DeletedMetadataFilters_QNAME = new QName(
        "http://schemas.microsoft.com/xrm/2011/Metadata/Query", "DeletedMetadataFilters");
    private final static QName _DeletedMetadataCollection_QNAME = new QName(
        "http://schemas.microsoft.com/xrm/2011/Metadata/Query", "DeletedMetadataCollection");
    private final static QName _ExecuteMultipleSettings_QNAME = new QName(
        "http://schemas.microsoft.com/xrm/2012/Contracts", "ExecuteMultipleSettings");
    private final static QName _OrganizationResponseCollection_QNAME = new QName(
        "http://schemas.microsoft.com/xrm/2012/Contracts", "OrganizationResponseCollection");
    private final static QName _OrganizationRequestCollection_QNAME = new QName(
        "http://schemas.microsoft.com/xrm/2012/Contracts", "OrganizationRequestCollection");
    private final static QName _ExecuteMultipleResponseItem_QNAME = new QName(
        "http://schemas.microsoft.com/xrm/2012/Contracts", "ExecuteMultipleResponseItem");
    private final static QName _ArrayOfQuickFindConfiguration_QNAME = new QName(
        "http://schemas.datacontract.org/2004/07/Microsoft.Xrm.Sdk", "ArrayOfQuickFindConfiguration");
    private final static QName _QuickFindConfiguration_QNAME = new QName(
        "http://schemas.datacontract.org/2004/07/Microsoft.Xrm.Sdk", "QuickFindConfiguration");
    private final static QName _AppointmentProposal_QNAME = new QName("http://schemas.microsoft.com/crm/2011/Contracts",
        "AppointmentProposal");
    private final static QName _ArrayOfProposalParty_QNAME = new QName(
        "http://schemas.microsoft.com/crm/2011/Contracts", "ArrayOfProposalParty");
    private final static QName _ProposalParty_QNAME = new QName("http://schemas.microsoft.com/crm/2011/Contracts",
        "ProposalParty");
    private final static QName _ArrayOfAppointmentProposal_QNAME = new QName(
        "http://schemas.microsoft.com/crm/2011/Contracts", "ArrayOfAppointmentProposal");
    private final static QName _ArrayOfArrayOfAppointmentProposal_QNAME = new QName(
        "http://schemas.microsoft.com/crm/2011/Contracts", "ArrayOfArrayOfAppointmentProposal");
    private final static QName _SearchDirection_QNAME = new QName("http://schemas.microsoft.com/crm/2011/Contracts",
        "SearchDirection");
    private final static QName _ArrayOfSearchDirection_QNAME = new QName(
        "http://schemas.microsoft.com/crm/2011/Contracts", "ArrayOfSearchDirection");
    private final static QName _ArrayOfArrayOfSearchDirection_QNAME = new QName(
        "http://schemas.microsoft.com/crm/2011/Contracts", "ArrayOfArrayOfSearchDirection");
    private final static QName _AppointmentRequest_QNAME = new QName("http://schemas.microsoft.com/crm/2011/Contracts",
        "AppointmentRequest");
    private final static QName _ArrayOfAppointmentsToIgnore_QNAME = new QName(
        "http://schemas.microsoft.com/crm/2011/Contracts", "ArrayOfAppointmentsToIgnore");
    private final static QName _AppointmentsToIgnore_QNAME = new QName(
        "http://schemas.microsoft.com/crm/2011/Contracts", "AppointmentsToIgnore");
    private final static QName _ArrayOfConstraintRelation_QNAME = new QName(
        "http://schemas.microsoft.com/crm/2011/Contracts", "ArrayOfConstraintRelation");
    private final static QName _ConstraintRelation_QNAME = new QName("http://schemas.microsoft.com/crm/2011/Contracts",
        "ConstraintRelation");
    private final static QName _ArrayOfObjectiveRelation_QNAME = new QName(
        "http://schemas.microsoft.com/crm/2011/Contracts", "ArrayOfObjectiveRelation");
    private final static QName _ObjectiveRelation_QNAME = new QName("http://schemas.microsoft.com/crm/2011/Contracts",
        "ObjectiveRelation");
    private final static QName _ArrayOfRequiredResource_QNAME = new QName(
        "http://schemas.microsoft.com/crm/2011/Contracts", "ArrayOfRequiredResource");
    private final static QName _RequiredResource_QNAME = new QName("http://schemas.microsoft.com/crm/2011/Contracts",
        "RequiredResource");
    private final static QName _ArrayOfAppointmentRequest_QNAME = new QName(
        "http://schemas.microsoft.com/crm/2011/Contracts", "ArrayOfAppointmentRequest");
    private final static QName _ArrayOfArrayOfAppointmentRequest_QNAME = new QName(
        "http://schemas.microsoft.com/crm/2011/Contracts", "ArrayOfArrayOfAppointmentRequest");
    private final static QName _ArrayOfArrayOfAppointmentsToIgnore_QNAME = new QName(
        "http://schemas.microsoft.com/crm/2011/Contracts", "ArrayOfArrayOfAppointmentsToIgnore");
    private final static QName _AuditDetail_QNAME = new QName("http://schemas.microsoft.com/crm/2011/Contracts",
        "AuditDetail");
    private final static QName _AttributeAuditDetail_QNAME = new QName(
        "http://schemas.microsoft.com/crm/2011/Contracts", "AttributeAuditDetail");
    private final static QName _ShareAuditDetail_QNAME = new QName("http://schemas.microsoft.com/crm/2011/Contracts",
        "ShareAuditDetail");
    private final static QName _AccessRights_QNAME = new QName("http://schemas.microsoft.com/crm/2011/Contracts",
        "AccessRights");
    private final static QName _RelationshipAuditDetail_QNAME = new QName(
        "http://schemas.microsoft.com/crm/2011/Contracts", "RelationshipAuditDetail");
    private final static QName _ArrayOfAuditDetail_QNAME = new QName("http://schemas.microsoft.com/crm/2011/Contracts",
        "ArrayOfAuditDetail");
    private final static QName _ArrayOfArrayOfAuditDetail_QNAME = new QName(
        "http://schemas.microsoft.com/crm/2011/Contracts", "ArrayOfArrayOfAuditDetail");
    private final static QName _ArrayOfAttributeAuditDetail_QNAME = new QName(
        "http://schemas.microsoft.com/crm/2011/Contracts", "ArrayOfAttributeAuditDetail");
    private final static QName _ArrayOfArrayOfAttributeAuditDetail_QNAME = new QName(
        "http://schemas.microsoft.com/crm/2011/Contracts", "ArrayOfArrayOfAttributeAuditDetail");
    private final static QName _AuditDetailCollection_QNAME = new QName(
        "http://schemas.microsoft.com/crm/2011/Contracts", "AuditDetailCollection");
    private final static QName _ArrayOfAuditDetailCollection_QNAME = new QName(
        "http://schemas.microsoft.com/crm/2011/Contracts", "ArrayOfAuditDetailCollection");
    private final static QName _ArrayOfArrayOfAuditDetailCollection_QNAME = new QName(
        "http://schemas.microsoft.com/crm/2011/Contracts", "ArrayOfArrayOfAuditDetailCollection");
    private final static QName _AuditPartitionDetail_QNAME = new QName(
        "http://schemas.microsoft.com/crm/2011/Contracts", "AuditPartitionDetail");
    private final static QName _ArrayOfAuditPartitionDetail_QNAME = new QName(
        "http://schemas.microsoft.com/crm/2011/Contracts", "ArrayOfAuditPartitionDetail");
    private final static QName _ArrayOfArrayOfAuditPartitionDetail_QNAME = new QName(
        "http://schemas.microsoft.com/crm/2011/Contracts", "ArrayOfArrayOfAuditPartitionDetail");
    private final static QName _AuditPartitionDetailCollection_QNAME = new QName(
        "http://schemas.microsoft.com/crm/2011/Contracts", "AuditPartitionDetailCollection");
    private final static QName _ArrayOfAuditPartitionDetailCollection_QNAME = new QName(
        "http://schemas.microsoft.com/crm/2011/Contracts", "ArrayOfAuditPartitionDetailCollection");
    private final static QName _ArrayOfArrayOfAuditPartitionDetailCollection_QNAME = new QName(
        "http://schemas.microsoft.com/crm/2011/Contracts", "ArrayOfArrayOfAuditPartitionDetailCollection");
    private final static QName _ComponentDetail_QNAME = new QName("http://schemas.microsoft.com/crm/2011/Contracts",
        "ComponentDetail");
    private final static QName _ArrayOfComponentDetail_QNAME = new QName(
        "http://schemas.microsoft.com/crm/2011/Contracts", "ArrayOfComponentDetail");
    private final static QName _ArrayOfArrayOfComponentDetail_QNAME = new QName(
        "http://schemas.microsoft.com/crm/2011/Contracts", "ArrayOfArrayOfComponentDetail");
    private final static QName _ArrayOfArrayOfConstraintRelation_QNAME = new QName(
        "http://schemas.microsoft.com/crm/2011/Contracts", "ArrayOfArrayOfConstraintRelation");
    private final static QName _BulkOperationSource_QNAME = new QName("http://schemas.microsoft.com/crm/2011/Contracts",
        "BulkOperationSource");
    private final static QName _ArrayOfBulkOperationSource_QNAME = new QName(
        "http://schemas.microsoft.com/crm/2011/Contracts", "ArrayOfBulkOperationSource");
    private final static QName _ArrayOfArrayOfBulkOperationSource_QNAME = new QName(
        "http://schemas.microsoft.com/crm/2011/Contracts", "ArrayOfArrayOfBulkOperationSource");
    private final static QName _EntitySource_QNAME = new QName("http://schemas.microsoft.com/crm/2011/Contracts",
        "EntitySource");
    private final static QName _ArrayOfEntitySource_QNAME = new QName("http://schemas.microsoft.com/crm/2011/Contracts",
        "ArrayOfEntitySource");
    private final static QName _ArrayOfArrayOfEntitySource_QNAME = new QName(
        "http://schemas.microsoft.com/crm/2011/Contracts", "ArrayOfArrayOfEntitySource");
    private final static QName _TargetFieldType_QNAME = new QName("http://schemas.microsoft.com/crm/2011/Contracts",
        "TargetFieldType");
    private final static QName _ArrayOfTargetFieldType_QNAME = new QName(
        "http://schemas.microsoft.com/crm/2011/Contracts", "ArrayOfTargetFieldType");
    private final static QName _ArrayOfArrayOfTargetFieldType_QNAME = new QName(
        "http://schemas.microsoft.com/crm/2011/Contracts", "ArrayOfArrayOfTargetFieldType");
    private final static QName _PropagationOwnershipOptions_QNAME = new QName(
        "http://schemas.microsoft.com/crm/2011/Contracts", "PropagationOwnershipOptions");
    private final static QName _ArrayOfPropagationOwnershipOptions_QNAME = new QName(
        "http://schemas.microsoft.com/crm/2011/Contracts", "ArrayOfPropagationOwnershipOptions");
    private final static QName _ArrayOfArrayOfPropagationOwnershipOptions_QNAME = new QName(
        "http://schemas.microsoft.com/crm/2011/Contracts", "ArrayOfArrayOfPropagationOwnershipOptions");
    private final static QName _RollupType_QNAME = new QName("http://schemas.microsoft.com/crm/2011/Contracts",
        "RollupType");
    private final static QName _ArrayOfRollupType_QNAME = new QName("http://schemas.microsoft.com/crm/2011/Contracts",
        "ArrayOfRollupType");
    private final static QName _ArrayOfArrayOfRollupType_QNAME = new QName(
        "http://schemas.microsoft.com/crm/2011/Contracts", "ArrayOfArrayOfRollupType");
    private final static QName _ExportDynamicToExcelType_QNAME = new QName(
        "http://schemas.microsoft.com/crm/2011/Contracts", "ExportDynamicToExcelType");
    private final static QName _ArrayOfExportDynamicToExcelType_QNAME = new QName(
        "http://schemas.microsoft.com/crm/2011/Contracts", "ArrayOfExportDynamicToExcelType");
    private final static QName _ArrayOfArrayOfExportDynamicToExcelType_QNAME = new QName(
        "http://schemas.microsoft.com/crm/2011/Contracts", "ArrayOfArrayOfExportDynamicToExcelType");
    private final static QName _ErrorInfo_QNAME = new QName("http://schemas.microsoft.com/crm/2011/Contracts",
        "ErrorInfo");
    private final static QName _ArrayOfResourceInfo_QNAME = new QName("http://schemas.microsoft.com/crm/2011/Contracts",
        "ArrayOfResourceInfo");
    private final static QName _ResourceInfo_QNAME = new QName("http://schemas.microsoft.com/crm/2011/Contracts",
        "ResourceInfo");
    private final static QName _ArrayOfErrorInfo_QNAME = new QName("http://schemas.microsoft.com/crm/2011/Contracts",
        "ArrayOfErrorInfo");
    private final static QName _ArrayOfArrayOfErrorInfo_QNAME = new QName(
        "http://schemas.microsoft.com/crm/2011/Contracts", "ArrayOfArrayOfErrorInfo");
    private final static QName _InputArgumentCollection_QNAME = new QName(
        "http://schemas.microsoft.com/crm/2011/Contracts", "InputArgumentCollection");
    private final static QName _ArrayOfInputArgumentCollection_QNAME = new QName(
        "http://schemas.microsoft.com/crm/2011/Contracts", "ArrayOfInputArgumentCollection");
    private final static QName _ArrayOfArrayOfInputArgumentCollection_QNAME = new QName(
        "http://schemas.microsoft.com/crm/2011/Contracts", "ArrayOfArrayOfInputArgumentCollection");
    private final static QName _BusinessNotification_QNAME = new QName(
        "http://schemas.microsoft.com/crm/2011/Contracts", "BusinessNotification");
    private final static QName _ArrayOfBusinessNotification_QNAME = new QName(
        "http://schemas.microsoft.com/crm/2011/Contracts", "ArrayOfBusinessNotification");
    private final static QName _ArrayOfArrayOfBusinessNotification_QNAME = new QName(
        "http://schemas.microsoft.com/crm/2011/Contracts", "ArrayOfArrayOfBusinessNotification");
    private final static QName _MissingComponent_QNAME = new QName("http://schemas.microsoft.com/crm/2011/Contracts",
        "MissingComponent");
    private final static QName _ArrayOfMissingComponent_QNAME = new QName(
        "http://schemas.microsoft.com/crm/2011/Contracts", "ArrayOfMissingComponent");
    private final static QName _ArrayOfArrayOfMissingComponent_QNAME = new QName(
        "http://schemas.microsoft.com/crm/2011/Contracts", "ArrayOfArrayOfMissingComponent");
    private final static QName _ArrayOfArrayOfObjectiveRelation_QNAME = new QName(
        "http://schemas.microsoft.com/crm/2011/Contracts", "ArrayOfArrayOfObjectiveRelation");
    private final static QName _OrganizationResources_QNAME = new QName(
        "http://schemas.microsoft.com/crm/2011/Contracts", "OrganizationResources");
    private final static QName _ArrayOfOrganizationResources_QNAME = new QName(
        "http://schemas.microsoft.com/crm/2011/Contracts", "ArrayOfOrganizationResources");
    private final static QName _ArrayOfArrayOfOrganizationResources_QNAME = new QName(
        "http://schemas.microsoft.com/crm/2011/Contracts", "ArrayOfArrayOfOrganizationResources");
    private final static QName _PrincipalAccess_QNAME = new QName("http://schemas.microsoft.com/crm/2011/Contracts",
        "PrincipalAccess");
    private final static QName _ArrayOfPrincipalAccess_QNAME = new QName(
        "http://schemas.microsoft.com/crm/2011/Contracts", "ArrayOfPrincipalAccess");
    private final static QName _ArrayOfArrayOfPrincipalAccess_QNAME = new QName(
        "http://schemas.microsoft.com/crm/2011/Contracts", "ArrayOfArrayOfPrincipalAccess");
    private final static QName _ArrayOfAccessRights_QNAME = new QName("http://schemas.microsoft.com/crm/2011/Contracts",
        "ArrayOfAccessRights");
    private final static QName _ArrayOfArrayOfAccessRights_QNAME = new QName(
        "http://schemas.microsoft.com/crm/2011/Contracts", "ArrayOfArrayOfAccessRights");
    private final static QName _ArrayOfArrayOfProposalParty_QNAME = new QName(
        "http://schemas.microsoft.com/crm/2011/Contracts", "ArrayOfArrayOfProposalParty");
    private final static QName _ArrayOfRelationshipAuditDetail_QNAME = new QName(
        "http://schemas.microsoft.com/crm/2011/Contracts", "ArrayOfRelationshipAuditDetail");
    private final static QName _ArrayOfArrayOfRelationshipAuditDetail_QNAME = new QName(
        "http://schemas.microsoft.com/crm/2011/Contracts", "ArrayOfArrayOfRelationshipAuditDetail");
    private final static QName _ArrayOfArrayOfRequiredResource_QNAME = new QName(
        "http://schemas.microsoft.com/crm/2011/Contracts", "ArrayOfArrayOfRequiredResource");
    private final static QName _ArrayOfArrayOfResourceInfo_QNAME = new QName(
        "http://schemas.microsoft.com/crm/2011/Contracts", "ArrayOfArrayOfResourceInfo");
    private final static QName _RibbonLocationFilters_QNAME = new QName(
        "http://schemas.microsoft.com/crm/2011/Contracts", "RibbonLocationFilters");
    private final static QName _ArrayOfRibbonLocationFilters_QNAME = new QName(
        "http://schemas.microsoft.com/crm/2011/Contracts", "ArrayOfRibbonLocationFilters");
    private final static QName _ArrayOfArrayOfRibbonLocationFilters_QNAME = new QName(
        "http://schemas.microsoft.com/crm/2011/Contracts", "ArrayOfArrayOfRibbonLocationFilters");
    private final static QName _PrivilegeDepth_QNAME = new QName("http://schemas.microsoft.com/crm/2011/Contracts",
        "PrivilegeDepth");
    private final static QName _ArrayOfPrivilegeDepth_QNAME = new QName(
        "http://schemas.microsoft.com/crm/2011/Contracts", "ArrayOfPrivilegeDepth");
    private final static QName _ArrayOfArrayOfPrivilegeDepth_QNAME = new QName(
        "http://schemas.microsoft.com/crm/2011/Contracts", "ArrayOfArrayOfPrivilegeDepth");
    private final static QName _RolePrivilege_QNAME = new QName("http://schemas.microsoft.com/crm/2011/Contracts",
        "RolePrivilege");
    private final static QName _ArrayOfRolePrivilege_QNAME = new QName(
        "http://schemas.microsoft.com/crm/2011/Contracts", "ArrayOfRolePrivilege");
    private final static QName _ArrayOfArrayOfRolePrivilege_QNAME = new QName(
        "http://schemas.microsoft.com/crm/2011/Contracts", "ArrayOfArrayOfRolePrivilege");
    private final static QName _SearchResults_QNAME = new QName("http://schemas.microsoft.com/crm/2011/Contracts",
        "SearchResults");
    private final static QName _TraceInfo_QNAME = new QName("http://schemas.microsoft.com/crm/2011/Contracts",
        "TraceInfo");
    private final static QName _ArrayOfSearchResults_QNAME = new QName(
        "http://schemas.microsoft.com/crm/2011/Contracts", "ArrayOfSearchResults");
    private final static QName _ArrayOfArrayOfSearchResults_QNAME = new QName(
        "http://schemas.microsoft.com/crm/2011/Contracts", "ArrayOfArrayOfSearchResults");
    private final static QName _ArrayOfShareAuditDetail_QNAME = new QName(
        "http://schemas.microsoft.com/crm/2011/Contracts", "ArrayOfShareAuditDetail");
    private final static QName _ArrayOfArrayOfShareAuditDetail_QNAME = new QName(
        "http://schemas.microsoft.com/crm/2011/Contracts", "ArrayOfArrayOfShareAuditDetail");
    private final static QName _RolePrivilegeAuditDetail_QNAME = new QName(
        "http://schemas.microsoft.com/crm/2011/Contracts", "RolePrivilegeAuditDetail");
    private final static QName _ArrayOfRolePrivilegeAuditDetail_QNAME = new QName(
        "http://schemas.microsoft.com/crm/2011/Contracts", "ArrayOfRolePrivilegeAuditDetail");
    private final static QName _ArrayOfArrayOfRolePrivilegeAuditDetail_QNAME = new QName(
        "http://schemas.microsoft.com/crm/2011/Contracts", "ArrayOfArrayOfRolePrivilegeAuditDetail");
    private final static QName _TimeInfo_QNAME = new QName("http://schemas.microsoft.com/crm/2011/Contracts",
        "TimeInfo");
    private final static QName _SubCode_QNAME = new QName("http://schemas.microsoft.com/crm/2011/Contracts", "SubCode");
    private final static QName _TimeCode_QNAME = new QName("http://schemas.microsoft.com/crm/2011/Contracts",
        "TimeCode");
    private final static QName _ArrayOfTimeInfo_QNAME = new QName("http://schemas.microsoft.com/crm/2011/Contracts",
        "ArrayOfTimeInfo");
    private final static QName _ArrayOfArrayOfTimeInfo_QNAME = new QName(
        "http://schemas.microsoft.com/crm/2011/Contracts", "ArrayOfArrayOfTimeInfo");
    private final static QName _ArrayOfTimeCode_QNAME = new QName("http://schemas.microsoft.com/crm/2011/Contracts",
        "ArrayOfTimeCode");
    private final static QName _ArrayOfArrayOfTimeCode_QNAME = new QName(
        "http://schemas.microsoft.com/crm/2011/Contracts", "ArrayOfArrayOfTimeCode");
    private final static QName _ArrayOfSubCode_QNAME = new QName("http://schemas.microsoft.com/crm/2011/Contracts",
        "ArrayOfSubCode");
    private final static QName _ArrayOfArrayOfSubCode_QNAME = new QName(
        "http://schemas.microsoft.com/crm/2011/Contracts", "ArrayOfArrayOfSubCode");
    private final static QName _ArrayOfTraceInfo_QNAME = new QName("http://schemas.microsoft.com/crm/2011/Contracts",
        "ArrayOfTraceInfo");
    private final static QName _ArrayOfArrayOfTraceInfo_QNAME = new QName(
        "http://schemas.microsoft.com/crm/2011/Contracts", "ArrayOfArrayOfTraceInfo");
    private final static QName _UserAccessAuditDetail_QNAME = new QName(
        "http://schemas.microsoft.com/crm/2011/Contracts", "UserAccessAuditDetail");
    private final static QName _ArrayOfUserAccessAuditDetail_QNAME = new QName(
        "http://schemas.microsoft.com/crm/2011/Contracts", "ArrayOfUserAccessAuditDetail");
    private final static QName _ArrayOfArrayOfUserAccessAuditDetail_QNAME = new QName(
        "http://schemas.microsoft.com/crm/2011/Contracts", "ArrayOfArrayOfUserAccessAuditDetail");
    private final static QName _ValidationResult_QNAME = new QName("http://schemas.microsoft.com/crm/2011/Contracts",
        "ValidationResult");
    private final static QName _ArrayOfValidationResult_QNAME = new QName(
        "http://schemas.microsoft.com/crm/2011/Contracts", "ArrayOfValidationResult");
    private final static QName _ArrayOfArrayOfValidationResult_QNAME = new QName(
        "http://schemas.microsoft.com/crm/2011/Contracts", "ArrayOfArrayOfValidationResult");
    private final static QName _CacheItem_QNAME = new QName("http://schemas.microsoft.com/crm/2011/Contracts",
        "CacheItem");
    private final static QName _ArrayOfCacheItem_QNAME = new QName("http://schemas.microsoft.com/crm/2011/Contracts",
        "ArrayOfCacheItem");
    private final static QName _ArrayOfArrayOfCacheItem_QNAME = new QName(
        "http://schemas.microsoft.com/crm/2011/Contracts", "ArrayOfArrayOfCacheItem");
    private final static QName _FaultType_QNAME = new QName("http://schemas.microsoft.com/crm/2011/Contracts",
        "FaultType");
    private final static QName _ArrayOfFaultType_QNAME = new QName("http://schemas.microsoft.com/crm/2011/Contracts",
        "ArrayOfFaultType");
    private final static QName _ArrayOfArrayOfFaultType_QNAME = new QName(
        "http://schemas.microsoft.com/crm/2011/Contracts", "ArrayOfArrayOfFaultType");
    private final static QName _QueryByEntityNameDictionary_QNAME = new QName(
        "http://schemas.microsoft.com/crm/2011/Contracts", "QueryByEntityNameDictionary");
    private final static QName _ArrayOfQueryByEntityNameDictionary_QNAME = new QName(
        "http://schemas.microsoft.com/crm/2011/Contracts", "ArrayOfQueryByEntityNameDictionary");
    private final static QName _ArrayOfArrayOfQueryByEntityNameDictionary_QNAME = new QName(
        "http://schemas.microsoft.com/crm/2011/Contracts", "ArrayOfArrayOfQueryByEntityNameDictionary");
    private final static QName _ResetSyncStateInfo_QNAME = new QName("http://schemas.microsoft.com/crm/2011/Contracts",
        "ResetSyncStateInfo");
    private final static QName _ArrayOfResetSyncStateInfo_QNAME = new QName(
        "http://schemas.microsoft.com/crm/2011/Contracts", "ArrayOfResetSyncStateInfo");
    private final static QName _ArrayOfArrayOfResetSyncStateInfo_QNAME = new QName(
        "http://schemas.microsoft.com/crm/2011/Contracts", "ArrayOfArrayOfResetSyncStateInfo");
    private final static QName _SdkMessageProcessingStepImageRegistration_QNAME = new QName(
        "http://schemas.microsoft.com/crm/2011/Contracts", "SdkMessageProcessingStepImageRegistration");
    private final static QName _ArrayOfSdkMessageProcessingStepImageRegistration_QNAME = new QName(
        "http://schemas.microsoft.com/crm/2011/Contracts", "ArrayOfSdkMessageProcessingStepImageRegistration");
    private final static QName _ArrayOfArrayOfSdkMessageProcessingStepImageRegistration_QNAME = new QName(
        "http://schemas.microsoft.com/crm/2011/Contracts", "ArrayOfArrayOfSdkMessageProcessingStepImageRegistration");
    private final static QName _SdkMessageProcessingStepRegistration_QNAME = new QName(
        "http://schemas.microsoft.com/crm/2011/Contracts", "SdkMessageProcessingStepRegistration");
    private final static QName _ArrayOfSdkMessageProcessingStepRegistration_QNAME = new QName(
        "http://schemas.microsoft.com/crm/2011/Contracts", "ArrayOfSdkMessageProcessingStepRegistration");
    private final static QName _ArrayOfArrayOfSdkMessageProcessingStepRegistration_QNAME = new QName(
        "http://schemas.microsoft.com/crm/2011/Contracts", "ArrayOfArrayOfSdkMessageProcessingStepRegistration");
    private final static QName _SyncAction_QNAME = new QName("http://schemas.microsoft.com/crm/2011/Contracts",
        "SyncAction");
    private final static QName _ArrayOfSyncAction_QNAME = new QName("http://schemas.microsoft.com/crm/2011/Contracts",
        "ArrayOfSyncAction");
    private final static QName _ArrayOfArrayOfSyncAction_QNAME = new QName(
        "http://schemas.microsoft.com/crm/2011/Contracts", "ArrayOfArrayOfSyncAction");
    private final static QName _ArrayOfBusinessNotificationParameter_QNAME = new QName(
        "http://schemas.datacontract.org/2004/07/Microsoft.Crm.Sdk.Messages", "ArrayOfBusinessNotificationParameter");
    private final static QName _BusinessNotificationParameter_QNAME = new QName(
        "http://schemas.datacontract.org/2004/07/Microsoft.Crm.Sdk.Messages", "BusinessNotificationParameter");
    private final static QName _BusinessNotificationParameterType_QNAME = new QName(
        "http://schemas.datacontract.org/2004/07/Microsoft.Crm.Sdk.Messages", "BusinessNotificationParameterType");
    private final static QName _BusinessNotificationSeverity_QNAME = new QName(
        "http://schemas.datacontract.org/2004/07/Microsoft.Crm.Sdk.Messages", "BusinessNotificationSeverity");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package:
     * org.sohagroup.crmconnector.domain.crm.model
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ArrayOfKeyValueOfintstring }
     */
    public ArrayOfKeyValueOfintstring createArrayOfKeyValueOfintstring() {
        return new ArrayOfKeyValueOfintstring();
    }

    /**
     * Create an instance of {@link ArrayOfKeyValueOfstringstring }
     */
    public ArrayOfKeyValueOfstringstring createArrayOfKeyValueOfstringstring() {
        return new ArrayOfKeyValueOfstringstring();
    }

    /**
     * Create an instance of {@link Create }
     */
    public Create createCreate() {
        return new Create();
    }

    /**
     * Create an instance of {@link Entity }
     */
    public Entity createEntity() {
        return new Entity();
    }

    /**
     * Create an instance of {@link CreateResponse }
     */
    public CreateResponse createCreateResponse() {
        return new CreateResponse();
    }

    /**
     * Create an instance of {@link Retrieve }
     */
    public Retrieve createRetrieve() {
        return new Retrieve();
    }

    /**
     * Create an instance of {@link ColumnSet }
     */
    public ColumnSet createColumnSet() {
        return new ColumnSet();
    }

    /**
     * Create an instance of {@link RetrieveResponse }
     */
    public RetrieveResponse createRetrieveResponse() {
        return new RetrieveResponse();
    }

    /**
     * Create an instance of {@link Update }
     */
    public Update createUpdate() {
        return new Update();
    }

    /**
     * Create an instance of {@link UpdateResponse }
     */
    public UpdateResponse createUpdateResponse() {
        return new UpdateResponse();
    }

    /**
     * Create an instance of {@link Delete }
     */
    public Delete createDelete() {
        return new Delete();
    }

    /**
     * Create an instance of {@link DeleteResponse }
     */
    public DeleteResponse createDeleteResponse() {
        return new DeleteResponse();
    }

    /**
     * Create an instance of {@link Execute }
     */
    public Execute createExecute() {
        return new Execute();
    }

    /**
     * Create an instance of {@link OrganizationRequest }
     */
    public OrganizationRequest createOrganizationRequest() {
        return new OrganizationRequest();
    }

    /**
     * Create an instance of {@link ExecuteResponse }
     */
    public ExecuteResponse createExecuteResponse() {
        return new ExecuteResponse();
    }

    /**
     * Create an instance of {@link OrganizationResponse }
     */
    public OrganizationResponse createOrganizationResponse() {
        return new OrganizationResponse();
    }

    /**
     * Create an instance of {@link Associate }
     */
    public Associate createAssociate() {
        return new Associate();
    }

    /**
     * Create an instance of {@link Relationship }
     */
    public Relationship createRelationship() {
        return new Relationship();
    }

    /**
     * Create an instance of {@link EntityReferenceCollection }
     */
    public EntityReferenceCollection createEntityReferenceCollection() {
        return new EntityReferenceCollection();
    }

    /**
     * Create an instance of {@link AssociateResponse }
     */
    public AssociateResponse createAssociateResponse() {
        return new AssociateResponse();
    }

    /**
     * Create an instance of {@link Disassociate }
     */
    public Disassociate createDisassociate() {
        return new Disassociate();
    }

    /**
     * Create an instance of {@link DisassociateResponse }
     */
    public DisassociateResponse createDisassociateResponse() {
        return new DisassociateResponse();
    }

    /**
     * Create an instance of {@link RetrieveMultiple }
     */
    public RetrieveMultiple createRetrieveMultiple() {
        return new RetrieveMultiple();
    }

    /**
     * Create an instance of {@link QueryBase }
     */
    public QueryBase createQueryBase() {
        return new QueryBase();
    }

    /**
     * Create an instance of {@link RetrieveMultipleResponse }
     */
    public RetrieveMultipleResponse createRetrieveMultipleResponse() {
        return new RetrieveMultipleResponse();
    }

    /**
     * Create an instance of {@link EntityCollection }
     */
    public EntityCollection createEntityCollection() {
        return new EntityCollection();
    }

    /**
     * Create an instance of {@link AttributeCollection }
     */
    public AttributeCollection createAttributeCollection() {
        return new AttributeCollection();
    }

    /**
     * Create an instance of {@link Money }
     */
    public Money createMoney() {
        return new Money();
    }

    /**
     * Create an instance of {@link ArrayOfMoney }
     */
    public ArrayOfMoney createArrayOfMoney() {
        return new ArrayOfMoney();
    }

    /**
     * Create an instance of {@link EntityReference }
     */
    public EntityReference createEntityReference() {
        return new EntityReference();
    }

    /**
     * Create an instance of {@link ArrayOfEntityReference }
     */
    public ArrayOfEntityReference createArrayOfEntityReference() {
        return new ArrayOfEntityReference();
    }

    /**
     * Create an instance of {@link OptionSetValue }
     */
    public OptionSetValue createOptionSetValue() {
        return new OptionSetValue();
    }

    /**
     * Create an instance of {@link ArrayOfOptionSetValue }
     */
    public ArrayOfOptionSetValue createArrayOfOptionSetValue() {
        return new ArrayOfOptionSetValue();
    }

    /**
     * Create an instance of {@link ArrayOfEntity }
     */
    public ArrayOfEntity createArrayOfEntity() {
        return new ArrayOfEntity();
    }

    /**
     * Create an instance of {@link Label }
     */
    public Label createLabel() {
        return new Label();
    }

    /**
     * Create an instance of {@link LocalizedLabelCollection }
     */
    public LocalizedLabelCollection createLocalizedLabelCollection() {
        return new LocalizedLabelCollection();
    }

    /**
     * Create an instance of {@link LocalizedLabel }
     */
    public LocalizedLabel createLocalizedLabel() {
        return new LocalizedLabel();
    }

    /**
     * Create an instance of {@link BooleanManagedProperty }
     */
    public BooleanManagedProperty createBooleanManagedProperty() {
        return new BooleanManagedProperty();
    }

    /**
     * Create an instance of {@link ManagedPropertyboolean }
     */
    public ManagedPropertyboolean createManagedPropertyboolean() {
        return new ManagedPropertyboolean();
    }

    /**
     * Create an instance of {@link ManagedPropertyAttributeRequiredLevel }
     */
    public ManagedPropertyAttributeRequiredLevel createManagedPropertyAttributeRequiredLevel() {
        return new ManagedPropertyAttributeRequiredLevel();
    }

    /**
     * Create an instance of {@link AliasedValue }
     */
    public AliasedValue createAliasedValue() {
        return new AliasedValue();
    }

    /**
     * Create an instance of {@link QueryExpression }
     */
    public QueryExpression createQueryExpression() {
        return new QueryExpression();
    }

    /**
     * Create an instance of {@link FilterExpression }
     */
    public FilterExpression createFilterExpression() {
        return new FilterExpression();
    }

    /**
     * Create an instance of {@link ArrayOfConditionExpression }
     */
    public ArrayOfConditionExpression createArrayOfConditionExpression() {
        return new ArrayOfConditionExpression();
    }

    /**
     * Create an instance of {@link ConditionExpression }
     */
    public ConditionExpression createConditionExpression() {
        return new ConditionExpression();
    }

    /**
     * Create an instance of {@link ArrayOfFilterExpression }
     */
    public ArrayOfFilterExpression createArrayOfFilterExpression() {
        return new ArrayOfFilterExpression();
    }

    /**
     * Create an instance of {@link ArrayOfLinkEntity }
     */
    public ArrayOfLinkEntity createArrayOfLinkEntity() {
        return new ArrayOfLinkEntity();
    }

    /**
     * Create an instance of {@link LinkEntity }
     */
    public LinkEntity createLinkEntity() {
        return new LinkEntity();
    }

    /**
     * Create an instance of {@link ArrayOfOrderExpression }
     */
    public ArrayOfOrderExpression createArrayOfOrderExpression() {
        return new ArrayOfOrderExpression();
    }

    /**
     * Create an instance of {@link OrderExpression }
     */
    public OrderExpression createOrderExpression() {
        return new OrderExpression();
    }

    /**
     * Create an instance of {@link PagingInfo }
     */
    public PagingInfo createPagingInfo() {
        return new PagingInfo();
    }

    /**
     * Create an instance of {@link QueryByAttribute }
     */
    public QueryByAttribute createQueryByAttribute() {
        return new QueryByAttribute();
    }

    /**
     * Create an instance of {@link FetchExpression }
     */
    public FetchExpression createFetchExpression() {
        return new FetchExpression();
    }

    /**
     * Create an instance of {@link ArrayOfQueryExpression }
     */
    public ArrayOfQueryExpression createArrayOfQueryExpression() {
        return new ArrayOfQueryExpression();
    }

    /**
     * Create an instance of {@link ArrayOfLocalizedLabel }
     */
    public ArrayOfLocalizedLabel createArrayOfLocalizedLabel() {
        return new ArrayOfLocalizedLabel();
    }

    /**
     * Create an instance of {@link AttributePrivilegeCollection }
     */
    public AttributePrivilegeCollection createAttributePrivilegeCollection() {
        return new AttributePrivilegeCollection();
    }

    /**
     * Create an instance of {@link AttributePrivilege }
     */
    public AttributePrivilege createAttributePrivilege() {
        return new AttributePrivilege();
    }

    /**
     * Create an instance of {@link RelationshipQueryCollection }
     */
    public RelationshipQueryCollection createRelationshipQueryCollection() {
        return new RelationshipQueryCollection();
    }

    /**
     * Create an instance of {@link EntityMetadataCollection }
     */
    public EntityMetadataCollection createEntityMetadataCollection() {
        return new EntityMetadataCollection();
    }

    /**
     * Create an instance of {@link ParameterCollection }
     */
    public ParameterCollection createParameterCollection() {
        return new ParameterCollection();
    }

    /**
     * Create an instance of {@link OrganizationServiceFault }
     */
    public OrganizationServiceFault createOrganizationServiceFault() {
        return new OrganizationServiceFault();
    }

    /**
     * Create an instance of {@link BaseServiceFault }
     */
    public BaseServiceFault createBaseServiceFault() {
        return new BaseServiceFault();
    }

    /**
     * Create an instance of {@link ErrorDetailCollection }
     */
    public ErrorDetailCollection createErrorDetailCollection() {
        return new ErrorDetailCollection();
    }

    /**
     * Create an instance of {@link DiscoveryServiceFault }
     */
    public DiscoveryServiceFault createDiscoveryServiceFault() {
        return new DiscoveryServiceFault();
    }

    /**
     * Create an instance of {@link QuickFindResultCollection }
     */
    public QuickFindResultCollection createQuickFindResultCollection() {
        return new QuickFindResultCollection();
    }

    /**
     * Create an instance of {@link QuickFindResult }
     */
    public QuickFindResult createQuickFindResult() {
        return new QuickFindResult();
    }

    /**
     * Create an instance of {@link AttributeMappingCollection }
     */
    public AttributeMappingCollection createAttributeMappingCollection() {
        return new AttributeMappingCollection();
    }

    /**
     * Create an instance of {@link FormattedValueCollection }
     */
    public FormattedValueCollection createFormattedValueCollection() {
        return new FormattedValueCollection();
    }

    /**
     * Create an instance of {@link RelatedEntityCollection }
     */
    public RelatedEntityCollection createRelatedEntityCollection() {
        return new RelatedEntityCollection();
    }

    /**
     * Create an instance of {@link KeyValuePairOfstringanyType }
     */
    public KeyValuePairOfstringanyType createKeyValuePairOfstringanyType() {
        return new KeyValuePairOfstringanyType();
    }

    /**
     * Create an instance of {@link KeyValuePairOfRelationshipQueryBaseXPsK4FkN }
     */
    public KeyValuePairOfRelationshipQueryBaseXPsK4FkN createKeyValuePairOfRelationshipQueryBaseXPsK4FkN() {
        return new KeyValuePairOfRelationshipQueryBaseXPsK4FkN();
    }

    /**
     * Create an instance of {@link KeyValuePairOfDeletedMetadataFiltersArrayOfguidPlUvPKtF }
     */
    public KeyValuePairOfDeletedMetadataFiltersArrayOfguidPlUvPKtF createKeyValuePairOfDeletedMetadataFiltersArrayOfguidPlUvPKtF() {
        return new KeyValuePairOfDeletedMetadataFiltersArrayOfguidPlUvPKtF();
    }

    /**
     * Create an instance of {@link KeyValuePairOfEndpointTypestringyDL0RVHi }
     */
    public KeyValuePairOfEndpointTypestringyDL0RVHi createKeyValuePairOfEndpointTypestringyDL0RVHi() {
        return new KeyValuePairOfEndpointTypestringyDL0RVHi();
    }

    /**
     * Create an instance of {@link ArrayOfKeyValuePairOfstringanyType }
     */
    public ArrayOfKeyValuePairOfstringanyType createArrayOfKeyValuePairOfstringanyType() {
        return new ArrayOfKeyValuePairOfstringanyType();
    }

    /**
     * Create an instance of {@link KeyValuePairOfstringQueryBasegUGIFE1S }
     */
    public KeyValuePairOfstringQueryBasegUGIFE1S createKeyValuePairOfstringQueryBasegUGIFE1S() {
        return new KeyValuePairOfstringQueryBasegUGIFE1S();
    }

    /**
     * Create an instance of {@link KeyValuePairOfstringstring }
     */
    public KeyValuePairOfstringstring createKeyValuePairOfstringstring() {
        return new KeyValuePairOfstringstring();
    }

    /**
     * Create an instance of {@link KeyValuePairOfRelationshipEntityCollectionXPsK4FkN }
     */
    public KeyValuePairOfRelationshipEntityCollectionXPsK4FkN createKeyValuePairOfRelationshipEntityCollectionXPsK4FkN() {
        return new KeyValuePairOfRelationshipEntityCollectionXPsK4FkN();
    }

    /**
     * Create an instance of {@link ArrayOfboolean }
     */
    public ArrayOfboolean createArrayOfboolean() {
        return new ArrayOfboolean();
    }

    /**
     * Create an instance of {@link ArrayOfint }
     */
    public ArrayOfint createArrayOfint() {
        return new ArrayOfint();
    }

    /**
     * Create an instance of {@link ArrayOfstring }
     */
    public ArrayOfstring createArrayOfstring() {
        return new ArrayOfstring();
    }

    /**
     * Create an instance of {@link ArrayOfArrayOfstring }
     */
    public ArrayOfArrayOfstring createArrayOfArrayOfstring() {
        return new ArrayOfArrayOfstring();
    }

    /**
     * Create an instance of {@link ArrayOfdouble }
     */
    public ArrayOfdouble createArrayOfdouble() {
        return new ArrayOfdouble();
    }

    /**
     * Create an instance of {@link ArrayOfdecimal }
     */
    public ArrayOfdecimal createArrayOfdecimal() {
        return new ArrayOfdecimal();
    }

    /**
     * Create an instance of {@link ArrayOfguid }
     */
    public ArrayOfguid createArrayOfguid() {
        return new ArrayOfguid();
    }

    /**
     * Create an instance of {@link ArrayOfdateTime }
     */
    public ArrayOfdateTime createArrayOfdateTime() {
        return new ArrayOfdateTime();
    }

    /**
     * Create an instance of {@link ArrayOfanyType }
     */
    public ArrayOfanyType createArrayOfanyType() {
        return new ArrayOfanyType();
    }

    /**
     * Create an instance of {@link MetadataBase }
     */
    public MetadataBase createMetadataBase() {
        return new MetadataBase();
    }

    /**
     * Create an instance of {@link RelationshipMetadataBase }
     */
    public RelationshipMetadataBase createRelationshipMetadataBase() {
        return new RelationshipMetadataBase();
    }

    /**
     * Create an instance of {@link OneToManyRelationshipMetadata }
     */
    public OneToManyRelationshipMetadata createOneToManyRelationshipMetadata() {
        return new OneToManyRelationshipMetadata();
    }

    /**
     * Create an instance of {@link AssociatedMenuConfiguration }
     */
    public AssociatedMenuConfiguration createAssociatedMenuConfiguration() {
        return new AssociatedMenuConfiguration();
    }

    /**
     * Create an instance of {@link CascadeConfiguration }
     */
    public CascadeConfiguration createCascadeConfiguration() {
        return new CascadeConfiguration();
    }

    /**
     * Create an instance of {@link ManyToManyRelationshipMetadata }
     */
    public ManyToManyRelationshipMetadata createManyToManyRelationshipMetadata() {
        return new ManyToManyRelationshipMetadata();
    }

    /**
     * Create an instance of {@link AttributeMetadata }
     */
    public AttributeMetadata createAttributeMetadata() {
        return new AttributeMetadata();
    }

    /**
     * Create an instance of {@link AttributeRequiredLevelManagedProperty }
     */
    public AttributeRequiredLevelManagedProperty createAttributeRequiredLevelManagedProperty() {
        return new AttributeRequiredLevelManagedProperty();
    }

    /**
     * Create an instance of {@link DateTimeAttributeMetadata }
     */
    public DateTimeAttributeMetadata createDateTimeAttributeMetadata() {
        return new DateTimeAttributeMetadata();
    }

    /**
     * Create an instance of {@link PicklistAttributeMetadata }
     */
    public PicklistAttributeMetadata createPicklistAttributeMetadata() {
        return new PicklistAttributeMetadata();
    }

    /**
     * Create an instance of {@link EnumAttributeMetadata }
     */
    public EnumAttributeMetadata createEnumAttributeMetadata() {
        return new EnumAttributeMetadata();
    }

    /**
     * Create an instance of {@link OptionSetMetadata }
     */
    public OptionSetMetadata createOptionSetMetadata() {
        return new OptionSetMetadata();
    }

    /**
     * Create an instance of {@link OptionSetMetadataBase }
     */
    public OptionSetMetadataBase createOptionSetMetadataBase() {
        return new OptionSetMetadataBase();
    }

    /**
     * Create an instance of {@link BooleanOptionSetMetadata }
     */
    public BooleanOptionSetMetadata createBooleanOptionSetMetadata() {
        return new BooleanOptionSetMetadata();
    }

    /**
     * Create an instance of {@link OptionMetadata }
     */
    public OptionMetadata createOptionMetadata() {
        return new OptionMetadata();
    }

    /**
     * Create an instance of {@link StatusOptionMetadata }
     */
    public StatusOptionMetadata createStatusOptionMetadata() {
        return new StatusOptionMetadata();
    }

    /**
     * Create an instance of {@link StateOptionMetadata }
     */
    public StateOptionMetadata createStateOptionMetadata() {
        return new StateOptionMetadata();
    }

    /**
     * Create an instance of {@link EntityNameAttributeMetadata }
     */
    public EntityNameAttributeMetadata createEntityNameAttributeMetadata() {
        return new EntityNameAttributeMetadata();
    }

    /**
     * Create an instance of {@link StateAttributeMetadata }
     */
    public StateAttributeMetadata createStateAttributeMetadata() {
        return new StateAttributeMetadata();
    }

    /**
     * Create an instance of {@link StatusAttributeMetadata }
     */
    public StatusAttributeMetadata createStatusAttributeMetadata() {
        return new StatusAttributeMetadata();
    }

    /**
     * Create an instance of {@link LookupAttributeMetadata }
     */
    public LookupAttributeMetadata createLookupAttributeMetadata() {
        return new LookupAttributeMetadata();
    }

    /**
     * Create an instance of {@link BooleanAttributeMetadata }
     */
    public BooleanAttributeMetadata createBooleanAttributeMetadata() {
        return new BooleanAttributeMetadata();
    }

    /**
     * Create an instance of {@link DecimalAttributeMetadata }
     */
    public DecimalAttributeMetadata createDecimalAttributeMetadata() {
        return new DecimalAttributeMetadata();
    }

    /**
     * Create an instance of {@link DoubleAttributeMetadata }
     */
    public DoubleAttributeMetadata createDoubleAttributeMetadata() {
        return new DoubleAttributeMetadata();
    }

    /**
     * Create an instance of {@link ManagedPropertyAttributeMetadata }
     */
    public ManagedPropertyAttributeMetadata createManagedPropertyAttributeMetadata() {
        return new ManagedPropertyAttributeMetadata();
    }

    /**
     * Create an instance of {@link IntegerAttributeMetadata }
     */
    public IntegerAttributeMetadata createIntegerAttributeMetadata() {
        return new IntegerAttributeMetadata();
    }

    /**
     * Create an instance of {@link BigIntAttributeMetadata }
     */
    public BigIntAttributeMetadata createBigIntAttributeMetadata() {
        return new BigIntAttributeMetadata();
    }

    /**
     * Create an instance of {@link MemoAttributeMetadata }
     */
    public MemoAttributeMetadata createMemoAttributeMetadata() {
        return new MemoAttributeMetadata();
    }

    /**
     * Create an instance of {@link MoneyAttributeMetadata }
     */
    public MoneyAttributeMetadata createMoneyAttributeMetadata() {
        return new MoneyAttributeMetadata();
    }

    /**
     * Create an instance of {@link StringAttributeMetadata }
     */
    public StringAttributeMetadata createStringAttributeMetadata() {
        return new StringAttributeMetadata();
    }

    /**
     * Create an instance of {@link EntityMetadata }
     */
    public EntityMetadata createEntityMetadata() {
        return new EntityMetadata();
    }

    /**
     * Create an instance of {@link ArrayOfAttributeMetadata }
     */
    public ArrayOfAttributeMetadata createArrayOfAttributeMetadata() {
        return new ArrayOfAttributeMetadata();
    }

    /**
     * Create an instance of {@link ArrayOfManyToManyRelationshipMetadata }
     */
    public ArrayOfManyToManyRelationshipMetadata createArrayOfManyToManyRelationshipMetadata() {
        return new ArrayOfManyToManyRelationshipMetadata();
    }

    /**
     * Create an instance of {@link ArrayOfOneToManyRelationshipMetadata }
     */
    public ArrayOfOneToManyRelationshipMetadata createArrayOfOneToManyRelationshipMetadata() {
        return new ArrayOfOneToManyRelationshipMetadata();
    }

    /**
     * Create an instance of {@link ArrayOfSecurityPrivilegeMetadata }
     */
    public ArrayOfSecurityPrivilegeMetadata createArrayOfSecurityPrivilegeMetadata() {
        return new ArrayOfSecurityPrivilegeMetadata();
    }

    /**
     * Create an instance of {@link SecurityPrivilegeMetadata }
     */
    public SecurityPrivilegeMetadata createSecurityPrivilegeMetadata() {
        return new SecurityPrivilegeMetadata();
    }

    /**
     * Create an instance of {@link ArrayOfOptionMetadata }
     */
    public ArrayOfOptionMetadata createArrayOfOptionMetadata() {
        return new ArrayOfOptionMetadata();
    }

    /**
     * Create an instance of {@link ArrayOfEntityMetadata }
     */
    public ArrayOfEntityMetadata createArrayOfEntityMetadata() {
        return new ArrayOfEntityMetadata();
    }

    /**
     * Create an instance of {@link ArrayOfRelationshipMetadataBase }
     */
    public ArrayOfRelationshipMetadataBase createArrayOfRelationshipMetadataBase() {
        return new ArrayOfRelationshipMetadataBase();
    }

    /**
     * Create an instance of {@link ArrayOfOptionSetMetadataBase }
     */
    public ArrayOfOptionSetMetadataBase createArrayOfOptionSetMetadataBase() {
        return new ArrayOfOptionSetMetadataBase();
    }

    /**
     * Create an instance of {@link ManagedPropertyMetadata }
     */
    public ManagedPropertyMetadata createManagedPropertyMetadata() {
        return new ManagedPropertyMetadata();
    }

    /**
     * Create an instance of {@link ArrayOfManagedPropertyMetadata }
     */
    public ArrayOfManagedPropertyMetadata createArrayOfManagedPropertyMetadata() {
        return new ArrayOfManagedPropertyMetadata();
    }

    /**
     * Create an instance of {@link ArrayOfStringFormat }
     */
    public ArrayOfStringFormat createArrayOfStringFormat() {
        return new ArrayOfStringFormat();
    }

    /**
     * Create an instance of {@link ArrayOfAttributeRequiredLevel }
     */
    public ArrayOfAttributeRequiredLevel createArrayOfAttributeRequiredLevel() {
        return new ArrayOfAttributeRequiredLevel();
    }

    /**
     * Create an instance of {@link ArrayOfAttributeTypeCode }
     */
    public ArrayOfAttributeTypeCode createArrayOfAttributeTypeCode() {
        return new ArrayOfAttributeTypeCode();
    }

    /**
     * Create an instance of {@link ArrayOfCascadeType }
     */
    public ArrayOfCascadeType createArrayOfCascadeType() {
        return new ArrayOfCascadeType();
    }

    /**
     * Create an instance of {@link ArrayOfDateTimeFormat }
     */
    public ArrayOfDateTimeFormat createArrayOfDateTimeFormat() {
        return new ArrayOfDateTimeFormat();
    }

    /**
     * Create an instance of {@link ArrayOfIntegerFormat }
     */
    public ArrayOfIntegerFormat createArrayOfIntegerFormat() {
        return new ArrayOfIntegerFormat();
    }

    /**
     * Create an instance of {@link ArrayOfManagedPropertyEvaluationPriority }
     */
    public ArrayOfManagedPropertyEvaluationPriority createArrayOfManagedPropertyEvaluationPriority() {
        return new ArrayOfManagedPropertyEvaluationPriority();
    }

    /**
     * Create an instance of {@link ArrayOfManagedPropertyOperation }
     */
    public ArrayOfManagedPropertyOperation createArrayOfManagedPropertyOperation() {
        return new ArrayOfManagedPropertyOperation();
    }

    /**
     * Create an instance of {@link ArrayOfManagedPropertyType }
     */
    public ArrayOfManagedPropertyType createArrayOfManagedPropertyType() {
        return new ArrayOfManagedPropertyType();
    }

    /**
     * Create an instance of {@link ArrayOfSecurityTypes }
     */
    public ArrayOfSecurityTypes createArrayOfSecurityTypes() {
        return new ArrayOfSecurityTypes();
    }

    /**
     * Create an instance of {@link ArrayOfOwnershipTypes }
     */
    public ArrayOfOwnershipTypes createArrayOfOwnershipTypes() {
        return new ArrayOfOwnershipTypes();
    }

    /**
     * Create an instance of {@link ArrayOfImeMode }
     */
    public ArrayOfImeMode createArrayOfImeMode() {
        return new ArrayOfImeMode();
    }

    /**
     * Create an instance of {@link ArrayOfRelationshipType }
     */
    public ArrayOfRelationshipType createArrayOfRelationshipType() {
        return new ArrayOfRelationshipType();
    }

    /**
     * Create an instance of {@link AttributeTypeDisplayName }
     */
    public AttributeTypeDisplayName createAttributeTypeDisplayName() {
        return new AttributeTypeDisplayName();
    }

    /**
     * Create an instance of {@link ConstantsBase }
     */
    public ConstantsBase createConstantsBase() {
        return new ConstantsBase();
    }

    /**
     * Create an instance of {@link StringFormatName }
     */
    public StringFormatName createStringFormatName() {
        return new StringFormatName();
    }

    /**
     * Create an instance of {@link ImageAttributeMetadata }
     */
    public ImageAttributeMetadata createImageAttributeMetadata() {
        return new ImageAttributeMetadata();
    }

    /**
     * Create an instance of {@link ArrayOfAttributeTypeDisplayName }
     */
    public ArrayOfAttributeTypeDisplayName createArrayOfAttributeTypeDisplayName() {
        return new ArrayOfAttributeTypeDisplayName();
    }

    /**
     * Create an instance of {@link AttributeMapping }
     */
    public AttributeMapping createAttributeMapping() {
        return new AttributeMapping();
    }

    /**
     * Create an instance of {@link OrganizationDetail }
     */
    public OrganizationDetail createOrganizationDetail() {
        return new OrganizationDetail();
    }

    /**
     * Create an instance of {@link EndpointCollection }
     */
    public EndpointCollection createEndpointCollection() {
        return new EndpointCollection();
    }

    /**
     * Create an instance of {@link MetadataFilterExpression }
     */
    public MetadataFilterExpression createMetadataFilterExpression() {
        return new MetadataFilterExpression();
    }

    /**
     * Create an instance of {@link ArrayOfMetadataConditionExpression }
     */
    public ArrayOfMetadataConditionExpression createArrayOfMetadataConditionExpression() {
        return new ArrayOfMetadataConditionExpression();
    }

    /**
     * Create an instance of {@link MetadataConditionExpression }
     */
    public MetadataConditionExpression createMetadataConditionExpression() {
        return new MetadataConditionExpression();
    }

    /**
     * Create an instance of {@link ArrayOfMetadataFilterExpression }
     */
    public ArrayOfMetadataFilterExpression createArrayOfMetadataFilterExpression() {
        return new ArrayOfMetadataFilterExpression();
    }

    /**
     * Create an instance of {@link MetadataQueryBase }
     */
    public MetadataQueryBase createMetadataQueryBase() {
        return new MetadataQueryBase();
    }

    /**
     * Create an instance of {@link MetadataQueryExpression }
     */
    public MetadataQueryExpression createMetadataQueryExpression() {
        return new MetadataQueryExpression();
    }

    /**
     * Create an instance of {@link MetadataPropertiesExpression }
     */
    public MetadataPropertiesExpression createMetadataPropertiesExpression() {
        return new MetadataPropertiesExpression();
    }

    /**
     * Create an instance of {@link RelationshipQueryExpression }
     */
    public RelationshipQueryExpression createRelationshipQueryExpression() {
        return new RelationshipQueryExpression();
    }

    /**
     * Create an instance of {@link EntityQueryExpression }
     */
    public EntityQueryExpression createEntityQueryExpression() {
        return new EntityQueryExpression();
    }

    /**
     * Create an instance of {@link AttributeQueryExpression }
     */
    public AttributeQueryExpression createAttributeQueryExpression() {
        return new AttributeQueryExpression();
    }

    /**
     * Create an instance of {@link LabelQueryExpression }
     */
    public LabelQueryExpression createLabelQueryExpression() {
        return new LabelQueryExpression();
    }

    /**
     * Create an instance of {@link DeletedMetadataCollection }
     */
    public DeletedMetadataCollection createDeletedMetadataCollection() {
        return new DeletedMetadataCollection();
    }

    /**
     * Create an instance of {@link ExecuteMultipleSettings }
     */
    public ExecuteMultipleSettings createExecuteMultipleSettings() {
        return new ExecuteMultipleSettings();
    }

    /**
     * Create an instance of {@link OrganizationResponseCollection }
     */
    public OrganizationResponseCollection createOrganizationResponseCollection() {
        return new OrganizationResponseCollection();
    }

    /**
     * Create an instance of {@link OrganizationRequestCollection }
     */
    public OrganizationRequestCollection createOrganizationRequestCollection() {
        return new OrganizationRequestCollection();
    }

    /**
     * Create an instance of {@link ExecuteMultipleResponseItem }
     */
    public ExecuteMultipleResponseItem createExecuteMultipleResponseItem() {
        return new ExecuteMultipleResponseItem();
    }

    /**
     * Create an instance of {@link ArrayOfQuickFindConfiguration }
     */
    public ArrayOfQuickFindConfiguration createArrayOfQuickFindConfiguration() {
        return new ArrayOfQuickFindConfiguration();
    }

    /**
     * Create an instance of {@link QuickFindConfiguration }
     */
    public QuickFindConfiguration createQuickFindConfiguration() {
        return new QuickFindConfiguration();
    }

    /**
     * Create an instance of {@link AppointmentProposal }
     */
    public AppointmentProposal createAppointmentProposal() {
        return new AppointmentProposal();
    }

    /**
     * Create an instance of {@link ArrayOfProposalParty }
     */
    public ArrayOfProposalParty createArrayOfProposalParty() {
        return new ArrayOfProposalParty();
    }

    /**
     * Create an instance of {@link ProposalParty }
     */
    public ProposalParty createProposalParty() {
        return new ProposalParty();
    }

    /**
     * Create an instance of {@link ArrayOfAppointmentProposal }
     */
    public ArrayOfAppointmentProposal createArrayOfAppointmentProposal() {
        return new ArrayOfAppointmentProposal();
    }

    /**
     * Create an instance of {@link ArrayOfArrayOfAppointmentProposal }
     */
    public ArrayOfArrayOfAppointmentProposal createArrayOfArrayOfAppointmentProposal() {
        return new ArrayOfArrayOfAppointmentProposal();
    }

    /**
     * Create an instance of {@link ArrayOfSearchDirection }
     */
    public ArrayOfSearchDirection createArrayOfSearchDirection() {
        return new ArrayOfSearchDirection();
    }

    /**
     * Create an instance of {@link ArrayOfArrayOfSearchDirection }
     */
    public ArrayOfArrayOfSearchDirection createArrayOfArrayOfSearchDirection() {
        return new ArrayOfArrayOfSearchDirection();
    }

    /**
     * Create an instance of {@link AppointmentRequest }
     */
    public AppointmentRequest createAppointmentRequest() {
        return new AppointmentRequest();
    }

    /**
     * Create an instance of {@link ArrayOfAppointmentsToIgnore }
     */
    public ArrayOfAppointmentsToIgnore createArrayOfAppointmentsToIgnore() {
        return new ArrayOfAppointmentsToIgnore();
    }

    /**
     * Create an instance of {@link AppointmentsToIgnore }
     */
    public AppointmentsToIgnore createAppointmentsToIgnore() {
        return new AppointmentsToIgnore();
    }

    /**
     * Create an instance of {@link ArrayOfConstraintRelation }
     */
    public ArrayOfConstraintRelation createArrayOfConstraintRelation() {
        return new ArrayOfConstraintRelation();
    }

    /**
     * Create an instance of {@link ConstraintRelation }
     */
    public ConstraintRelation createConstraintRelation() {
        return new ConstraintRelation();
    }

    /**
     * Create an instance of {@link ArrayOfObjectiveRelation }
     */
    public ArrayOfObjectiveRelation createArrayOfObjectiveRelation() {
        return new ArrayOfObjectiveRelation();
    }

    /**
     * Create an instance of {@link ObjectiveRelation }
     */
    public ObjectiveRelation createObjectiveRelation() {
        return new ObjectiveRelation();
    }

    /**
     * Create an instance of {@link ArrayOfRequiredResource }
     */
    public ArrayOfRequiredResource createArrayOfRequiredResource() {
        return new ArrayOfRequiredResource();
    }

    /**
     * Create an instance of {@link RequiredResource }
     */
    public RequiredResource createRequiredResource() {
        return new RequiredResource();
    }

    /**
     * Create an instance of {@link ArrayOfAppointmentRequest }
     */
    public ArrayOfAppointmentRequest createArrayOfAppointmentRequest() {
        return new ArrayOfAppointmentRequest();
    }

    /**
     * Create an instance of {@link ArrayOfArrayOfAppointmentRequest }
     */
    public ArrayOfArrayOfAppointmentRequest createArrayOfArrayOfAppointmentRequest() {
        return new ArrayOfArrayOfAppointmentRequest();
    }

    /**
     * Create an instance of {@link ArrayOfArrayOfAppointmentsToIgnore }
     */
    public ArrayOfArrayOfAppointmentsToIgnore createArrayOfArrayOfAppointmentsToIgnore() {
        return new ArrayOfArrayOfAppointmentsToIgnore();
    }

    /**
     * Create an instance of {@link AuditDetail }
     */
    public AuditDetail createAuditDetail() {
        return new AuditDetail();
    }

    /**
     * Create an instance of {@link AttributeAuditDetail }
     */
    public AttributeAuditDetail createAttributeAuditDetail() {
        return new AttributeAuditDetail();
    }

    /**
     * Create an instance of {@link ShareAuditDetail }
     */
    public ShareAuditDetail createShareAuditDetail() {
        return new ShareAuditDetail();
    }

    /**
     * Create an instance of {@link RelationshipAuditDetail }
     */
    public RelationshipAuditDetail createRelationshipAuditDetail() {
        return new RelationshipAuditDetail();
    }

    /**
     * Create an instance of {@link ArrayOfAuditDetail }
     */
    public ArrayOfAuditDetail createArrayOfAuditDetail() {
        return new ArrayOfAuditDetail();
    }

    /**
     * Create an instance of {@link ArrayOfArrayOfAuditDetail }
     */
    public ArrayOfArrayOfAuditDetail createArrayOfArrayOfAuditDetail() {
        return new ArrayOfArrayOfAuditDetail();
    }

    /**
     * Create an instance of {@link ArrayOfAttributeAuditDetail }
     */
    public ArrayOfAttributeAuditDetail createArrayOfAttributeAuditDetail() {
        return new ArrayOfAttributeAuditDetail();
    }

    /**
     * Create an instance of {@link ArrayOfArrayOfAttributeAuditDetail }
     */
    public ArrayOfArrayOfAttributeAuditDetail createArrayOfArrayOfAttributeAuditDetail() {
        return new ArrayOfArrayOfAttributeAuditDetail();
    }

    /**
     * Create an instance of {@link AuditDetailCollection }
     */
    public AuditDetailCollection createAuditDetailCollection() {
        return new AuditDetailCollection();
    }

    /**
     * Create an instance of {@link ArrayOfAuditDetailCollection }
     */
    public ArrayOfAuditDetailCollection createArrayOfAuditDetailCollection() {
        return new ArrayOfAuditDetailCollection();
    }

    /**
     * Create an instance of {@link ArrayOfArrayOfAuditDetailCollection }
     */
    public ArrayOfArrayOfAuditDetailCollection createArrayOfArrayOfAuditDetailCollection() {
        return new ArrayOfArrayOfAuditDetailCollection();
    }

    /**
     * Create an instance of {@link AuditPartitionDetail }
     */
    public AuditPartitionDetail createAuditPartitionDetail() {
        return new AuditPartitionDetail();
    }

    /**
     * Create an instance of {@link ArrayOfAuditPartitionDetail }
     */
    public ArrayOfAuditPartitionDetail createArrayOfAuditPartitionDetail() {
        return new ArrayOfAuditPartitionDetail();
    }

    /**
     * Create an instance of {@link ArrayOfArrayOfAuditPartitionDetail }
     */
    public ArrayOfArrayOfAuditPartitionDetail createArrayOfArrayOfAuditPartitionDetail() {
        return new ArrayOfArrayOfAuditPartitionDetail();
    }

    /**
     * Create an instance of {@link AuditPartitionDetailCollection }
     */
    public AuditPartitionDetailCollection createAuditPartitionDetailCollection() {
        return new AuditPartitionDetailCollection();
    }

    /**
     * Create an instance of {@link ArrayOfAuditPartitionDetailCollection }
     */
    public ArrayOfAuditPartitionDetailCollection createArrayOfAuditPartitionDetailCollection() {
        return new ArrayOfAuditPartitionDetailCollection();
    }

    /**
     * Create an instance of {@link ArrayOfArrayOfAuditPartitionDetailCollection }
     */
    public ArrayOfArrayOfAuditPartitionDetailCollection createArrayOfArrayOfAuditPartitionDetailCollection() {
        return new ArrayOfArrayOfAuditPartitionDetailCollection();
    }

    /**
     * Create an instance of {@link ComponentDetail }
     */
    public ComponentDetail createComponentDetail() {
        return new ComponentDetail();
    }

    /**
     * Create an instance of {@link ArrayOfComponentDetail }
     */
    public ArrayOfComponentDetail createArrayOfComponentDetail() {
        return new ArrayOfComponentDetail();
    }

    /**
     * Create an instance of {@link ArrayOfArrayOfComponentDetail }
     */
    public ArrayOfArrayOfComponentDetail createArrayOfArrayOfComponentDetail() {
        return new ArrayOfArrayOfComponentDetail();
    }

    /**
     * Create an instance of {@link ArrayOfArrayOfConstraintRelation }
     */
    public ArrayOfArrayOfConstraintRelation createArrayOfArrayOfConstraintRelation() {
        return new ArrayOfArrayOfConstraintRelation();
    }

    /**
     * Create an instance of {@link ArrayOfBulkOperationSource }
     */
    public ArrayOfBulkOperationSource createArrayOfBulkOperationSource() {
        return new ArrayOfBulkOperationSource();
    }

    /**
     * Create an instance of {@link ArrayOfArrayOfBulkOperationSource }
     */
    public ArrayOfArrayOfBulkOperationSource createArrayOfArrayOfBulkOperationSource() {
        return new ArrayOfArrayOfBulkOperationSource();
    }

    /**
     * Create an instance of {@link ArrayOfEntitySource }
     */
    public ArrayOfEntitySource createArrayOfEntitySource() {
        return new ArrayOfEntitySource();
    }

    /**
     * Create an instance of {@link ArrayOfArrayOfEntitySource }
     */
    public ArrayOfArrayOfEntitySource createArrayOfArrayOfEntitySource() {
        return new ArrayOfArrayOfEntitySource();
    }

    /**
     * Create an instance of {@link ArrayOfTargetFieldType }
     */
    public ArrayOfTargetFieldType createArrayOfTargetFieldType() {
        return new ArrayOfTargetFieldType();
    }

    /**
     * Create an instance of {@link ArrayOfArrayOfTargetFieldType }
     */
    public ArrayOfArrayOfTargetFieldType createArrayOfArrayOfTargetFieldType() {
        return new ArrayOfArrayOfTargetFieldType();
    }

    /**
     * Create an instance of {@link ArrayOfPropagationOwnershipOptions }
     */
    public ArrayOfPropagationOwnershipOptions createArrayOfPropagationOwnershipOptions() {
        return new ArrayOfPropagationOwnershipOptions();
    }

    /**
     * Create an instance of {@link ArrayOfArrayOfPropagationOwnershipOptions }
     */
    public ArrayOfArrayOfPropagationOwnershipOptions createArrayOfArrayOfPropagationOwnershipOptions() {
        return new ArrayOfArrayOfPropagationOwnershipOptions();
    }

    /**
     * Create an instance of {@link ArrayOfRollupType }
     */
    public ArrayOfRollupType createArrayOfRollupType() {
        return new ArrayOfRollupType();
    }

    /**
     * Create an instance of {@link ArrayOfArrayOfRollupType }
     */
    public ArrayOfArrayOfRollupType createArrayOfArrayOfRollupType() {
        return new ArrayOfArrayOfRollupType();
    }

    /**
     * Create an instance of {@link ArrayOfExportDynamicToExcelType }
     */
    public ArrayOfExportDynamicToExcelType createArrayOfExportDynamicToExcelType() {
        return new ArrayOfExportDynamicToExcelType();
    }

    /**
     * Create an instance of {@link ArrayOfArrayOfExportDynamicToExcelType }
     */
    public ArrayOfArrayOfExportDynamicToExcelType createArrayOfArrayOfExportDynamicToExcelType() {
        return new ArrayOfArrayOfExportDynamicToExcelType();
    }

    /**
     * Create an instance of {@link ErrorInfo }
     */
    public ErrorInfo createErrorInfo() {
        return new ErrorInfo();
    }

    /**
     * Create an instance of {@link ArrayOfResourceInfo }
     */
    public ArrayOfResourceInfo createArrayOfResourceInfo() {
        return new ArrayOfResourceInfo();
    }

    /**
     * Create an instance of {@link ResourceInfo }
     */
    public ResourceInfo createResourceInfo() {
        return new ResourceInfo();
    }

    /**
     * Create an instance of {@link ArrayOfErrorInfo }
     */
    public ArrayOfErrorInfo createArrayOfErrorInfo() {
        return new ArrayOfErrorInfo();
    }

    /**
     * Create an instance of {@link ArrayOfArrayOfErrorInfo }
     */
    public ArrayOfArrayOfErrorInfo createArrayOfArrayOfErrorInfo() {
        return new ArrayOfArrayOfErrorInfo();
    }

    /**
     * Create an instance of {@link InputArgumentCollection }
     */
    public InputArgumentCollection createInputArgumentCollection() {
        return new InputArgumentCollection();
    }

    /**
     * Create an instance of {@link ArrayOfInputArgumentCollection }
     */
    public ArrayOfInputArgumentCollection createArrayOfInputArgumentCollection() {
        return new ArrayOfInputArgumentCollection();
    }

    /**
     * Create an instance of {@link ArrayOfArrayOfInputArgumentCollection }
     */
    public ArrayOfArrayOfInputArgumentCollection createArrayOfArrayOfInputArgumentCollection() {
        return new ArrayOfArrayOfInputArgumentCollection();
    }

    /**
     * Create an instance of {@link BusinessNotification }
     */
    public BusinessNotification createBusinessNotification() {
        return new BusinessNotification();
    }

    /**
     * Create an instance of {@link ArrayOfBusinessNotification }
     */
    public ArrayOfBusinessNotification createArrayOfBusinessNotification() {
        return new ArrayOfBusinessNotification();
    }

    /**
     * Create an instance of {@link ArrayOfArrayOfBusinessNotification }
     */
    public ArrayOfArrayOfBusinessNotification createArrayOfArrayOfBusinessNotification() {
        return new ArrayOfArrayOfBusinessNotification();
    }

    /**
     * Create an instance of {@link MissingComponent }
     */
    public MissingComponent createMissingComponent() {
        return new MissingComponent();
    }

    /**
     * Create an instance of {@link ArrayOfMissingComponent }
     */
    public ArrayOfMissingComponent createArrayOfMissingComponent() {
        return new ArrayOfMissingComponent();
    }

    /**
     * Create an instance of {@link ArrayOfArrayOfMissingComponent }
     */
    public ArrayOfArrayOfMissingComponent createArrayOfArrayOfMissingComponent() {
        return new ArrayOfArrayOfMissingComponent();
    }

    /**
     * Create an instance of {@link ArrayOfArrayOfObjectiveRelation }
     */
    public ArrayOfArrayOfObjectiveRelation createArrayOfArrayOfObjectiveRelation() {
        return new ArrayOfArrayOfObjectiveRelation();
    }

    /**
     * Create an instance of {@link OrganizationResources }
     */
    public OrganizationResources createOrganizationResources() {
        return new OrganizationResources();
    }

    /**
     * Create an instance of {@link ArrayOfOrganizationResources }
     */
    public ArrayOfOrganizationResources createArrayOfOrganizationResources() {
        return new ArrayOfOrganizationResources();
    }

    /**
     * Create an instance of {@link ArrayOfArrayOfOrganizationResources }
     */
    public ArrayOfArrayOfOrganizationResources createArrayOfArrayOfOrganizationResources() {
        return new ArrayOfArrayOfOrganizationResources();
    }

    /**
     * Create an instance of {@link PrincipalAccess }
     */
    public PrincipalAccess createPrincipalAccess() {
        return new PrincipalAccess();
    }

    /**
     * Create an instance of {@link ArrayOfPrincipalAccess }
     */
    public ArrayOfPrincipalAccess createArrayOfPrincipalAccess() {
        return new ArrayOfPrincipalAccess();
    }

    /**
     * Create an instance of {@link ArrayOfArrayOfPrincipalAccess }
     */
    public ArrayOfArrayOfPrincipalAccess createArrayOfArrayOfPrincipalAccess() {
        return new ArrayOfArrayOfPrincipalAccess();
    }

    /**
     * Create an instance of {@link ArrayOfAccessRights }
     */
    public ArrayOfAccessRights createArrayOfAccessRights() {
        return new ArrayOfAccessRights();
    }

    /**
     * Create an instance of {@link ArrayOfArrayOfAccessRights }
     */
    public ArrayOfArrayOfAccessRights createArrayOfArrayOfAccessRights() {
        return new ArrayOfArrayOfAccessRights();
    }

    /**
     * Create an instance of {@link ArrayOfArrayOfProposalParty }
     */
    public ArrayOfArrayOfProposalParty createArrayOfArrayOfProposalParty() {
        return new ArrayOfArrayOfProposalParty();
    }

    /**
     * Create an instance of {@link ArrayOfRelationshipAuditDetail }
     */
    public ArrayOfRelationshipAuditDetail createArrayOfRelationshipAuditDetail() {
        return new ArrayOfRelationshipAuditDetail();
    }

    /**
     * Create an instance of {@link ArrayOfArrayOfRelationshipAuditDetail }
     */
    public ArrayOfArrayOfRelationshipAuditDetail createArrayOfArrayOfRelationshipAuditDetail() {
        return new ArrayOfArrayOfRelationshipAuditDetail();
    }

    /**
     * Create an instance of {@link ArrayOfArrayOfRequiredResource }
     */
    public ArrayOfArrayOfRequiredResource createArrayOfArrayOfRequiredResource() {
        return new ArrayOfArrayOfRequiredResource();
    }

    /**
     * Create an instance of {@link ArrayOfArrayOfResourceInfo }
     */
    public ArrayOfArrayOfResourceInfo createArrayOfArrayOfResourceInfo() {
        return new ArrayOfArrayOfResourceInfo();
    }

    /**
     * Create an instance of {@link ArrayOfRibbonLocationFilters }
     */
    public ArrayOfRibbonLocationFilters createArrayOfRibbonLocationFilters() {
        return new ArrayOfRibbonLocationFilters();
    }

    /**
     * Create an instance of {@link ArrayOfArrayOfRibbonLocationFilters }
     */
    public ArrayOfArrayOfRibbonLocationFilters createArrayOfArrayOfRibbonLocationFilters() {
        return new ArrayOfArrayOfRibbonLocationFilters();
    }

    /**
     * Create an instance of {@link ArrayOfPrivilegeDepth }
     */
    public ArrayOfPrivilegeDepth createArrayOfPrivilegeDepth() {
        return new ArrayOfPrivilegeDepth();
    }

    /**
     * Create an instance of {@link ArrayOfArrayOfPrivilegeDepth }
     */
    public ArrayOfArrayOfPrivilegeDepth createArrayOfArrayOfPrivilegeDepth() {
        return new ArrayOfArrayOfPrivilegeDepth();
    }

    /**
     * Create an instance of {@link RolePrivilege }
     */
    public RolePrivilege createRolePrivilege() {
        return new RolePrivilege();
    }

    /**
     * Create an instance of {@link ArrayOfRolePrivilege }
     */
    public ArrayOfRolePrivilege createArrayOfRolePrivilege() {
        return new ArrayOfRolePrivilege();
    }

    /**
     * Create an instance of {@link ArrayOfArrayOfRolePrivilege }
     */
    public ArrayOfArrayOfRolePrivilege createArrayOfArrayOfRolePrivilege() {
        return new ArrayOfArrayOfRolePrivilege();
    }

    /**
     * Create an instance of {@link SearchResults }
     */
    public SearchResults createSearchResults() {
        return new SearchResults();
    }

    /**
     * Create an instance of {@link TraceInfo }
     */
    public TraceInfo createTraceInfo() {
        return new TraceInfo();
    }

    /**
     * Create an instance of {@link ArrayOfSearchResults }
     */
    public ArrayOfSearchResults createArrayOfSearchResults() {
        return new ArrayOfSearchResults();
    }

    /**
     * Create an instance of {@link ArrayOfArrayOfSearchResults }
     */
    public ArrayOfArrayOfSearchResults createArrayOfArrayOfSearchResults() {
        return new ArrayOfArrayOfSearchResults();
    }

    /**
     * Create an instance of {@link ArrayOfShareAuditDetail }
     */
    public ArrayOfShareAuditDetail createArrayOfShareAuditDetail() {
        return new ArrayOfShareAuditDetail();
    }

    /**
     * Create an instance of {@link ArrayOfArrayOfShareAuditDetail }
     */
    public ArrayOfArrayOfShareAuditDetail createArrayOfArrayOfShareAuditDetail() {
        return new ArrayOfArrayOfShareAuditDetail();
    }

    /**
     * Create an instance of {@link RolePrivilegeAuditDetail }
     */
    public RolePrivilegeAuditDetail createRolePrivilegeAuditDetail() {
        return new RolePrivilegeAuditDetail();
    }

    /**
     * Create an instance of {@link ArrayOfRolePrivilegeAuditDetail }
     */
    public ArrayOfRolePrivilegeAuditDetail createArrayOfRolePrivilegeAuditDetail() {
        return new ArrayOfRolePrivilegeAuditDetail();
    }

    /**
     * Create an instance of {@link ArrayOfArrayOfRolePrivilegeAuditDetail }
     */
    public ArrayOfArrayOfRolePrivilegeAuditDetail createArrayOfArrayOfRolePrivilegeAuditDetail() {
        return new ArrayOfArrayOfRolePrivilegeAuditDetail();
    }

    /**
     * Create an instance of {@link TimeInfo }
     */
    public TimeInfo createTimeInfo() {
        return new TimeInfo();
    }

    /**
     * Create an instance of {@link ArrayOfTimeInfo }
     */
    public ArrayOfTimeInfo createArrayOfTimeInfo() {
        return new ArrayOfTimeInfo();
    }

    /**
     * Create an instance of {@link ArrayOfArrayOfTimeInfo }
     */
    public ArrayOfArrayOfTimeInfo createArrayOfArrayOfTimeInfo() {
        return new ArrayOfArrayOfTimeInfo();
    }

    /**
     * Create an instance of {@link ArrayOfTimeCode }
     */
    public ArrayOfTimeCode createArrayOfTimeCode() {
        return new ArrayOfTimeCode();
    }

    /**
     * Create an instance of {@link ArrayOfArrayOfTimeCode }
     */
    public ArrayOfArrayOfTimeCode createArrayOfArrayOfTimeCode() {
        return new ArrayOfArrayOfTimeCode();
    }

    /**
     * Create an instance of {@link ArrayOfSubCode }
     */
    public ArrayOfSubCode createArrayOfSubCode() {
        return new ArrayOfSubCode();
    }

    /**
     * Create an instance of {@link ArrayOfArrayOfSubCode }
     */
    public ArrayOfArrayOfSubCode createArrayOfArrayOfSubCode() {
        return new ArrayOfArrayOfSubCode();
    }

    /**
     * Create an instance of {@link ArrayOfTraceInfo }
     */
    public ArrayOfTraceInfo createArrayOfTraceInfo() {
        return new ArrayOfTraceInfo();
    }

    /**
     * Create an instance of {@link ArrayOfArrayOfTraceInfo }
     */
    public ArrayOfArrayOfTraceInfo createArrayOfArrayOfTraceInfo() {
        return new ArrayOfArrayOfTraceInfo();
    }

    /**
     * Create an instance of {@link UserAccessAuditDetail }
     */
    public UserAccessAuditDetail createUserAccessAuditDetail() {
        return new UserAccessAuditDetail();
    }

    /**
     * Create an instance of {@link ArrayOfUserAccessAuditDetail }
     */
    public ArrayOfUserAccessAuditDetail createArrayOfUserAccessAuditDetail() {
        return new ArrayOfUserAccessAuditDetail();
    }

    /**
     * Create an instance of {@link ArrayOfArrayOfUserAccessAuditDetail }
     */
    public ArrayOfArrayOfUserAccessAuditDetail createArrayOfArrayOfUserAccessAuditDetail() {
        return new ArrayOfArrayOfUserAccessAuditDetail();
    }

    /**
     * Create an instance of {@link ValidationResult }
     */
    public ValidationResult createValidationResult() {
        return new ValidationResult();
    }

    /**
     * Create an instance of {@link ArrayOfValidationResult }
     */
    public ArrayOfValidationResult createArrayOfValidationResult() {
        return new ArrayOfValidationResult();
    }

    /**
     * Create an instance of {@link ArrayOfArrayOfValidationResult }
     */
    public ArrayOfArrayOfValidationResult createArrayOfArrayOfValidationResult() {
        return new ArrayOfArrayOfValidationResult();
    }

    /**
     * Create an instance of {@link CacheItem }
     */
    public CacheItem createCacheItem() {
        return new CacheItem();
    }

    /**
     * Create an instance of {@link ArrayOfCacheItem }
     */
    public ArrayOfCacheItem createArrayOfCacheItem() {
        return new ArrayOfCacheItem();
    }

    /**
     * Create an instance of {@link ArrayOfArrayOfCacheItem }
     */
    public ArrayOfArrayOfCacheItem createArrayOfArrayOfCacheItem() {
        return new ArrayOfArrayOfCacheItem();
    }

    /**
     * Create an instance of {@link ArrayOfFaultType }
     */
    public ArrayOfFaultType createArrayOfFaultType() {
        return new ArrayOfFaultType();
    }

    /**
     * Create an instance of {@link ArrayOfArrayOfFaultType }
     */
    public ArrayOfArrayOfFaultType createArrayOfArrayOfFaultType() {
        return new ArrayOfArrayOfFaultType();
    }

    /**
     * Create an instance of {@link QueryByEntityNameDictionary }
     */
    public QueryByEntityNameDictionary createQueryByEntityNameDictionary() {
        return new QueryByEntityNameDictionary();
    }

    /**
     * Create an instance of {@link ArrayOfQueryByEntityNameDictionary }
     */
    public ArrayOfQueryByEntityNameDictionary createArrayOfQueryByEntityNameDictionary() {
        return new ArrayOfQueryByEntityNameDictionary();
    }

    /**
     * Create an instance of {@link ArrayOfArrayOfQueryByEntityNameDictionary }
     */
    public ArrayOfArrayOfQueryByEntityNameDictionary createArrayOfArrayOfQueryByEntityNameDictionary() {
        return new ArrayOfArrayOfQueryByEntityNameDictionary();
    }

    /**
     * Create an instance of {@link ResetSyncStateInfo }
     */
    public ResetSyncStateInfo createResetSyncStateInfo() {
        return new ResetSyncStateInfo();
    }

    /**
     * Create an instance of {@link ArrayOfResetSyncStateInfo }
     */
    public ArrayOfResetSyncStateInfo createArrayOfResetSyncStateInfo() {
        return new ArrayOfResetSyncStateInfo();
    }

    /**
     * Create an instance of {@link ArrayOfArrayOfResetSyncStateInfo }
     */
    public ArrayOfArrayOfResetSyncStateInfo createArrayOfArrayOfResetSyncStateInfo() {
        return new ArrayOfArrayOfResetSyncStateInfo();
    }

    /**
     * Create an instance of {@link SdkMessageProcessingStepImageRegistration }
     */
    public SdkMessageProcessingStepImageRegistration createSdkMessageProcessingStepImageRegistration() {
        return new SdkMessageProcessingStepImageRegistration();
    }

    /**
     * Create an instance of {@link ArrayOfSdkMessageProcessingStepImageRegistration }
     */
    public ArrayOfSdkMessageProcessingStepImageRegistration createArrayOfSdkMessageProcessingStepImageRegistration() {
        return new ArrayOfSdkMessageProcessingStepImageRegistration();
    }

    /**
     * Create an instance of {@link ArrayOfArrayOfSdkMessageProcessingStepImageRegistration }
     */
    public ArrayOfArrayOfSdkMessageProcessingStepImageRegistration createArrayOfArrayOfSdkMessageProcessingStepImageRegistration() {
        return new ArrayOfArrayOfSdkMessageProcessingStepImageRegistration();
    }

    /**
     * Create an instance of {@link SdkMessageProcessingStepRegistration }
     */
    public SdkMessageProcessingStepRegistration createSdkMessageProcessingStepRegistration() {
        return new SdkMessageProcessingStepRegistration();
    }

    /**
     * Create an instance of {@link ArrayOfSdkMessageProcessingStepRegistration }
     */
    public ArrayOfSdkMessageProcessingStepRegistration createArrayOfSdkMessageProcessingStepRegistration() {
        return new ArrayOfSdkMessageProcessingStepRegistration();
    }

    /**
     * Create an instance of {@link ArrayOfArrayOfSdkMessageProcessingStepRegistration }
     */
    public ArrayOfArrayOfSdkMessageProcessingStepRegistration createArrayOfArrayOfSdkMessageProcessingStepRegistration() {
        return new ArrayOfArrayOfSdkMessageProcessingStepRegistration();
    }

    /**
     * Create an instance of {@link ArrayOfSyncAction }
     */
    public ArrayOfSyncAction createArrayOfSyncAction() {
        return new ArrayOfSyncAction();
    }

    /**
     * Create an instance of {@link ArrayOfArrayOfSyncAction }
     */
    public ArrayOfArrayOfSyncAction createArrayOfArrayOfSyncAction() {
        return new ArrayOfArrayOfSyncAction();
    }

    /**
     * Create an instance of {@link ArrayOfBusinessNotificationParameter }
     */
    public ArrayOfBusinessNotificationParameter createArrayOfBusinessNotificationParameter() {
        return new ArrayOfBusinessNotificationParameter();
    }

    /**
     * Create an instance of {@link BusinessNotificationParameter }
     */
    public BusinessNotificationParameter createBusinessNotificationParameter() {
        return new BusinessNotificationParameter();
    }

    /**
     * Create an instance of {@link ArrayOfKeyValueOfintstring.KeyValueOfintstring }
     */
    public ArrayOfKeyValueOfintstring.KeyValueOfintstring createArrayOfKeyValueOfintstringKeyValueOfintstring() {
        return new ArrayOfKeyValueOfintstring.KeyValueOfintstring();
    }

    /**
     * Create an instance of {@link ArrayOfKeyValueOfstringstring.KeyValueOfstringstring }
     */
    public ArrayOfKeyValueOfstringstring.KeyValueOfstringstring createArrayOfKeyValueOfstringstringKeyValueOfstringstring() {
        return new ArrayOfKeyValueOfstringstring.KeyValueOfstringstring();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link Object }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "anyType")
    public JAXBElement<Object> createAnyType(Object value) {
        return new JAXBElement<Object>(_AnyType_QNAME, Object.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "anyURI")
    public JAXBElement<String> createAnyURI(String value) {
        return new JAXBElement<String>(_AnyURI_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "base64Binary")
    public JAXBElement<byte[]> createBase64Binary(byte[] value) {
        return new JAXBElement<byte[]>(_Base64Binary_QNAME, byte[].class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "boolean")
    public JAXBElement<Boolean> createBoolean(Boolean value) {
        return new JAXBElement<Boolean>(_Boolean_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Byte }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link Byte }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "byte")
    public JAXBElement<Byte> createByte(Byte value) {
        return new JAXBElement<Byte>(_Byte_QNAME, Byte.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "dateTime")
    public JAXBElement<XMLGregorianCalendar> createDateTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_DateTime_QNAME, XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "decimal")
    public JAXBElement<BigDecimal> createDecimal(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_Decimal_QNAME, BigDecimal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link Double }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "double")
    public JAXBElement<Double> createDouble(Double value) {
        return new JAXBElement<Double>(_Double_QNAME, Double.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Float }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link Float }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "float")
    public JAXBElement<Float> createFloat(Float value) {
        return new JAXBElement<Float>(_Float_QNAME, Float.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "int")
    public JAXBElement<Integer> createInt(Integer value) {
        return new JAXBElement<Integer>(_Int_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "long")
    public JAXBElement<Long> createLong(Long value) {
        return new JAXBElement<Long>(_Long_QNAME, Long.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QName }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link QName }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "QName")
    public JAXBElement<QName> createQName(QName value) {
        return new JAXBElement<QName>(_QName_QNAME, QName.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Short }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link Short }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "short")
    public JAXBElement<Short> createShort(Short value) {
        return new JAXBElement<Short>(_Short_QNAME, Short.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "string")
    public JAXBElement<String> createString(String value) {
        return new JAXBElement<String>(_String_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Short }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link Short }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "unsignedByte")
    public JAXBElement<Short> createUnsignedByte(Short value) {
        return new JAXBElement<Short>(_UnsignedByte_QNAME, Short.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "unsignedInt")
    public JAXBElement<Long> createUnsignedInt(Long value) {
        return new JAXBElement<Long>(_UnsignedInt_QNAME, Long.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "unsignedLong")
    public JAXBElement<BigInteger> createUnsignedLong(BigInteger value) {
        return new JAXBElement<BigInteger>(_UnsignedLong_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "unsignedShort")
    public JAXBElement<Integer> createUnsignedShort(Integer value) {
        return new JAXBElement<Integer>(_UnsignedShort_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "char")
    public JAXBElement<Integer> createChar(Integer value) {
        return new JAXBElement<Integer>(_Char_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Duration }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link Duration }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "duration")
    public JAXBElement<Duration> createDuration(Duration value) {
        return new JAXBElement<Duration>(_Duration_QNAME, Duration.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "guid")
    public JAXBElement<String> createGuid(String value) {
        return new JAXBElement<String>(_Guid_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Entity }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link Entity }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/xrm/2011/Contracts", name = "Entity")
    public JAXBElement<Entity> createEntity(Entity value) {
        return new JAXBElement<Entity>(_Entity_QNAME, Entity.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AttributeCollection }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link AttributeCollection }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/xrm/2011/Contracts", name = "AttributeCollection")
    public JAXBElement<AttributeCollection> createAttributeCollection(AttributeCollection value) {
        return new JAXBElement<AttributeCollection>(_AttributeCollection_QNAME, AttributeCollection.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Money }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link Money }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/xrm/2011/Contracts", name = "Money")
    public JAXBElement<Money> createMoney(Money value) {
        return new JAXBElement<Money>(_Money_QNAME, Money.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfMoney }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link ArrayOfMoney }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/xrm/2011/Contracts", name = "ArrayOfMoney")
    public JAXBElement<ArrayOfMoney> createArrayOfMoney(ArrayOfMoney value) {
        return new JAXBElement<ArrayOfMoney>(_ArrayOfMoney_QNAME, ArrayOfMoney.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EntityReference }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link EntityReference }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/xrm/2011/Contracts", name = "EntityReference")
    public JAXBElement<EntityReference> createEntityReference(EntityReference value) {
        return new JAXBElement<EntityReference>(_EntityReference_QNAME, EntityReference.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfEntityReference }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link ArrayOfEntityReference }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/xrm/2011/Contracts", name = "ArrayOfEntityReference")
    public JAXBElement<ArrayOfEntityReference> createArrayOfEntityReference(ArrayOfEntityReference value) {
        return new JAXBElement<ArrayOfEntityReference>(_ArrayOfEntityReference_QNAME, ArrayOfEntityReference.class,
            null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OptionSetValue }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link OptionSetValue }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/xrm/2011/Contracts", name = "OptionSetValue")
    public JAXBElement<OptionSetValue> createOptionSetValue(OptionSetValue value) {
        return new JAXBElement<OptionSetValue>(_OptionSetValue_QNAME, OptionSetValue.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfOptionSetValue }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link ArrayOfOptionSetValue }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/xrm/2011/Contracts", name = "ArrayOfOptionSetValue")
    public JAXBElement<ArrayOfOptionSetValue> createArrayOfOptionSetValue(ArrayOfOptionSetValue value) {
        return new JAXBElement<ArrayOfOptionSetValue>(_ArrayOfOptionSetValue_QNAME, ArrayOfOptionSetValue.class, null,
            value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EntityCollection }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link EntityCollection }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/xrm/2011/Contracts", name = "EntityCollection")
    public JAXBElement<EntityCollection> createEntityCollection(EntityCollection value) {
        return new JAXBElement<EntityCollection>(_EntityCollection_QNAME, EntityCollection.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfEntity }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link ArrayOfEntity }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/xrm/2011/Contracts", name = "ArrayOfEntity")
    public JAXBElement<ArrayOfEntity> createArrayOfEntity(ArrayOfEntity value) {
        return new JAXBElement<ArrayOfEntity>(_ArrayOfEntity_QNAME, ArrayOfEntity.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Label }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link Label }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/xrm/2011/Contracts", name = "Label")
    public JAXBElement<Label> createLabel(Label value) {
        return new JAXBElement<Label>(_Label_QNAME, Label.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LocalizedLabelCollection }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link LocalizedLabelCollection }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/xrm/2011/Contracts", name = "LocalizedLabelCollection")
    public JAXBElement<LocalizedLabelCollection> createLocalizedLabelCollection(LocalizedLabelCollection value) {
        return new JAXBElement<LocalizedLabelCollection>(_LocalizedLabelCollection_QNAME,
            LocalizedLabelCollection.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LocalizedLabel }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link LocalizedLabel }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/xrm/2011/Contracts", name = "LocalizedLabel")
    public JAXBElement<LocalizedLabel> createLocalizedLabel(LocalizedLabel value) {
        return new JAXBElement<LocalizedLabel>(_LocalizedLabel_QNAME, LocalizedLabel.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BooleanManagedProperty }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link BooleanManagedProperty }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/xrm/2011/Contracts", name = "BooleanManagedProperty")
    public JAXBElement<BooleanManagedProperty> createBooleanManagedProperty(BooleanManagedProperty value) {
        return new JAXBElement<BooleanManagedProperty>(_BooleanManagedProperty_QNAME, BooleanManagedProperty.class,
            null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ManagedPropertyboolean }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link ManagedPropertyboolean }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/xrm/2011/Contracts", name = "ManagedPropertyboolean")
    public JAXBElement<ManagedPropertyboolean> createManagedPropertyboolean(ManagedPropertyboolean value) {
        return new JAXBElement<ManagedPropertyboolean>(_ManagedPropertyboolean_QNAME, ManagedPropertyboolean.class,
            null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ManagedPropertyAttributeRequiredLevel }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link ManagedPropertyAttributeRequiredLevel }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/xrm/2011/Contracts", name = "ManagedPropertyAttributeRequiredLevel")
    public JAXBElement<ManagedPropertyAttributeRequiredLevel> createManagedPropertyAttributeRequiredLevel(
        ManagedPropertyAttributeRequiredLevel value) {
        return new JAXBElement<ManagedPropertyAttributeRequiredLevel>(_ManagedPropertyAttributeRequiredLevel_QNAME,
            ManagedPropertyAttributeRequiredLevel.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AliasedValue }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link AliasedValue }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/xrm/2011/Contracts", name = "AliasedValue")
    public JAXBElement<AliasedValue> createAliasedValue(AliasedValue value) {
        return new JAXBElement<AliasedValue>(_AliasedValue_QNAME, AliasedValue.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ColumnSet }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link ColumnSet }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/xrm/2011/Contracts", name = "ColumnSet")
    public JAXBElement<ColumnSet> createColumnSet(ColumnSet value) {
        return new JAXBElement<ColumnSet>(_ColumnSet_QNAME, ColumnSet.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EntityReferenceCollection }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link EntityReferenceCollection }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/xrm/2011/Contracts", name = "EntityReferenceCollection")
    public JAXBElement<EntityReferenceCollection> createEntityReferenceCollection(EntityReferenceCollection value) {
        return new JAXBElement<EntityReferenceCollection>(_EntityReferenceCollection_QNAME,
            EntityReferenceCollection.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QueryBase }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link QueryBase }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/xrm/2011/Contracts", name = "QueryBase")
    public JAXBElement<QueryBase> createQueryBase(QueryBase value) {
        return new JAXBElement<QueryBase>(_QueryBase_QNAME, QueryBase.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QueryExpression }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link QueryExpression }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/xrm/2011/Contracts", name = "QueryExpression")
    public JAXBElement<QueryExpression> createQueryExpression(QueryExpression value) {
        return new JAXBElement<QueryExpression>(_QueryExpression_QNAME, QueryExpression.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FilterExpression }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link FilterExpression }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/xrm/2011/Contracts", name = "FilterExpression")
    public JAXBElement<FilterExpression> createFilterExpression(FilterExpression value) {
        return new JAXBElement<FilterExpression>(_FilterExpression_QNAME, FilterExpression.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfConditionExpression }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link ArrayOfConditionExpression }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/xrm/2011/Contracts", name = "ArrayOfConditionExpression")
    public JAXBElement<ArrayOfConditionExpression> createArrayOfConditionExpression(ArrayOfConditionExpression value) {
        return new JAXBElement<ArrayOfConditionExpression>(_ArrayOfConditionExpression_QNAME,
            ArrayOfConditionExpression.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConditionExpression }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link ConditionExpression }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/xrm/2011/Contracts", name = "ConditionExpression")
    public JAXBElement<ConditionExpression> createConditionExpression(ConditionExpression value) {
        return new JAXBElement<ConditionExpression>(_ConditionExpression_QNAME, ConditionExpression.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConditionOperator }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link ConditionOperator }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/xrm/2011/Contracts", name = "ConditionOperator")
    public JAXBElement<ConditionOperator> createConditionOperator(ConditionOperator value) {
        return new JAXBElement<ConditionOperator>(_ConditionOperator_QNAME, ConditionOperator.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LogicalOperator }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link LogicalOperator }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/xrm/2011/Contracts", name = "LogicalOperator")
    public JAXBElement<LogicalOperator> createLogicalOperator(LogicalOperator value) {
        return new JAXBElement<LogicalOperator>(_LogicalOperator_QNAME, LogicalOperator.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfFilterExpression }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link ArrayOfFilterExpression }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/xrm/2011/Contracts", name = "ArrayOfFilterExpression")
    public JAXBElement<ArrayOfFilterExpression> createArrayOfFilterExpression(ArrayOfFilterExpression value) {
        return new JAXBElement<ArrayOfFilterExpression>(_ArrayOfFilterExpression_QNAME, ArrayOfFilterExpression.class,
            null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfLinkEntity }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link ArrayOfLinkEntity }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/xrm/2011/Contracts", name = "ArrayOfLinkEntity")
    public JAXBElement<ArrayOfLinkEntity> createArrayOfLinkEntity(ArrayOfLinkEntity value) {
        return new JAXBElement<ArrayOfLinkEntity>(_ArrayOfLinkEntity_QNAME, ArrayOfLinkEntity.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LinkEntity }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link LinkEntity }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/xrm/2011/Contracts", name = "LinkEntity")
    public JAXBElement<LinkEntity> createLinkEntity(LinkEntity value) {
        return new JAXBElement<LinkEntity>(_LinkEntity_QNAME, LinkEntity.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link JoinOperator }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link JoinOperator }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/xrm/2011/Contracts", name = "JoinOperator")
    public JAXBElement<JoinOperator> createJoinOperator(JoinOperator value) {
        return new JAXBElement<JoinOperator>(_JoinOperator_QNAME, JoinOperator.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfOrderExpression }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link ArrayOfOrderExpression }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/xrm/2011/Contracts", name = "ArrayOfOrderExpression")
    public JAXBElement<ArrayOfOrderExpression> createArrayOfOrderExpression(ArrayOfOrderExpression value) {
        return new JAXBElement<ArrayOfOrderExpression>(_ArrayOfOrderExpression_QNAME, ArrayOfOrderExpression.class,
            null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OrderExpression }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link OrderExpression }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/xrm/2011/Contracts", name = "OrderExpression")
    public JAXBElement<OrderExpression> createOrderExpression(OrderExpression value) {
        return new JAXBElement<OrderExpression>(_OrderExpression_QNAME, OrderExpression.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OrderType }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link OrderType }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/xrm/2011/Contracts", name = "OrderType")
    public JAXBElement<OrderType> createOrderType(OrderType value) {
        return new JAXBElement<OrderType>(_OrderType_QNAME, OrderType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PagingInfo }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link PagingInfo }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/xrm/2011/Contracts", name = "PagingInfo")
    public JAXBElement<PagingInfo> createPagingInfo(PagingInfo value) {
        return new JAXBElement<PagingInfo>(_PagingInfo_QNAME, PagingInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QueryByAttribute }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link QueryByAttribute }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/xrm/2011/Contracts", name = "QueryByAttribute")
    public JAXBElement<QueryByAttribute> createQueryByAttribute(QueryByAttribute value) {
        return new JAXBElement<QueryByAttribute>(_QueryByAttribute_QNAME, QueryByAttribute.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FetchExpression }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link FetchExpression }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/xrm/2011/Contracts", name = "FetchExpression")
    public JAXBElement<FetchExpression> createFetchExpression(FetchExpression value) {
        return new JAXBElement<FetchExpression>(_FetchExpression_QNAME, FetchExpression.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfQueryExpression }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link ArrayOfQueryExpression }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/xrm/2011/Contracts", name = "ArrayOfQueryExpression")
    public JAXBElement<ArrayOfQueryExpression> createArrayOfQueryExpression(ArrayOfQueryExpression value) {
        return new JAXBElement<ArrayOfQueryExpression>(_ArrayOfQueryExpression_QNAME, ArrayOfQueryExpression.class,
            null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfLocalizedLabel }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link ArrayOfLocalizedLabel }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/xrm/2011/Contracts", name = "ArrayOfLocalizedLabel")
    public JAXBElement<ArrayOfLocalizedLabel> createArrayOfLocalizedLabel(ArrayOfLocalizedLabel value) {
        return new JAXBElement<ArrayOfLocalizedLabel>(_ArrayOfLocalizedLabel_QNAME, ArrayOfLocalizedLabel.class, null,
            value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Relationship }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link Relationship }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/xrm/2011/Contracts", name = "Relationship")
    public JAXBElement<Relationship> createRelationship(Relationship value) {
        return new JAXBElement<Relationship>(_Relationship_QNAME, Relationship.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EntityRole }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link EntityRole }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/xrm/2011/Contracts", name = "EntityRole")
    public JAXBElement<EntityRole> createEntityRole(EntityRole value) {
        return new JAXBElement<EntityRole>(_EntityRole_QNAME, EntityRole.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AttributePrivilegeCollection }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link AttributePrivilegeCollection }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/xrm/2011/Contracts", name = "AttributePrivilegeCollection")
    public JAXBElement<AttributePrivilegeCollection> createAttributePrivilegeCollection(
        AttributePrivilegeCollection value) {
        return new JAXBElement<AttributePrivilegeCollection>(_AttributePrivilegeCollection_QNAME,
            AttributePrivilegeCollection.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AttributePrivilege }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link AttributePrivilege }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/xrm/2011/Contracts", name = "AttributePrivilege")
    public JAXBElement<AttributePrivilege> createAttributePrivilege(AttributePrivilege value) {
        return new JAXBElement<AttributePrivilege>(_AttributePrivilege_QNAME, AttributePrivilege.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RelationshipQueryCollection }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link RelationshipQueryCollection }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/xrm/2011/Contracts", name = "RelationshipQueryCollection")
    public JAXBElement<RelationshipQueryCollection> createRelationshipQueryCollection(
        RelationshipQueryCollection value) {
        return new JAXBElement<RelationshipQueryCollection>(_RelationshipQueryCollection_QNAME,
            RelationshipQueryCollection.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EntityMetadataCollection }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link EntityMetadataCollection }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/xrm/2011/Contracts", name = "EntityMetadataCollection")
    public JAXBElement<EntityMetadataCollection> createEntityMetadataCollection(EntityMetadataCollection value) {
        return new JAXBElement<EntityMetadataCollection>(_EntityMetadataCollection_QNAME,
            EntityMetadataCollection.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OrganizationRequest }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link OrganizationRequest }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/xrm/2011/Contracts", name = "OrganizationRequest")
    public JAXBElement<OrganizationRequest> createOrganizationRequest(OrganizationRequest value) {
        return new JAXBElement<OrganizationRequest>(_OrganizationRequest_QNAME, OrganizationRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ParameterCollection }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link ParameterCollection }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/xrm/2011/Contracts", name = "ParameterCollection")
    public JAXBElement<ParameterCollection> createParameterCollection(ParameterCollection value) {
        return new JAXBElement<ParameterCollection>(_ParameterCollection_QNAME, ParameterCollection.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OrganizationServiceFault }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link OrganizationServiceFault }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/xrm/2011/Contracts", name = "OrganizationServiceFault")
    public JAXBElement<OrganizationServiceFault> createOrganizationServiceFault(OrganizationServiceFault value) {
        return new JAXBElement<OrganizationServiceFault>(_OrganizationServiceFault_QNAME,
            OrganizationServiceFault.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BaseServiceFault }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link BaseServiceFault }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/xrm/2011/Contracts", name = "BaseServiceFault")
    public JAXBElement<BaseServiceFault> createBaseServiceFault(BaseServiceFault value) {
        return new JAXBElement<BaseServiceFault>(_BaseServiceFault_QNAME, BaseServiceFault.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ErrorDetailCollection }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link ErrorDetailCollection }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/xrm/2011/Contracts", name = "ErrorDetailCollection")
    public JAXBElement<ErrorDetailCollection> createErrorDetailCollection(ErrorDetailCollection value) {
        return new JAXBElement<ErrorDetailCollection>(_ErrorDetailCollection_QNAME, ErrorDetailCollection.class, null,
            value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DiscoveryServiceFault }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link DiscoveryServiceFault }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/xrm/2011/Contracts", name = "DiscoveryServiceFault")
    public JAXBElement<DiscoveryServiceFault> createDiscoveryServiceFault(DiscoveryServiceFault value) {
        return new JAXBElement<DiscoveryServiceFault>(_DiscoveryServiceFault_QNAME, DiscoveryServiceFault.class, null,
            value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OrganizationResponse }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link OrganizationResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/xrm/2011/Contracts", name = "OrganizationResponse")
    public JAXBElement<OrganizationResponse> createOrganizationResponse(OrganizationResponse value) {
        return new JAXBElement<OrganizationResponse>(_OrganizationResponse_QNAME, OrganizationResponse.class, null,
            value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QuickFindResultCollection }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link QuickFindResultCollection }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/xrm/2011/Contracts", name = "QuickFindResultCollection")
    public JAXBElement<QuickFindResultCollection> createQuickFindResultCollection(QuickFindResultCollection value) {
        return new JAXBElement<QuickFindResultCollection>(_QuickFindResultCollection_QNAME,
            QuickFindResultCollection.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QuickFindResult }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link QuickFindResult }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/xrm/2011/Contracts", name = "QuickFindResult")
    public JAXBElement<QuickFindResult> createQuickFindResult(QuickFindResult value) {
        return new JAXBElement<QuickFindResult>(_QuickFindResult_QNAME, QuickFindResult.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AttributeMappingCollection }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link AttributeMappingCollection }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/xrm/2011/Contracts", name = "AttributeMappingCollection")
    public JAXBElement<AttributeMappingCollection> createAttributeMappingCollection(AttributeMappingCollection value) {
        return new JAXBElement<AttributeMappingCollection>(_AttributeMappingCollection_QNAME,
            AttributeMappingCollection.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EntityState }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link EntityState }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/xrm/2011/Contracts", name = "EntityState")
    public JAXBElement<EntityState> createEntityState(EntityState value) {
        return new JAXBElement<EntityState>(_EntityState_QNAME, EntityState.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FormattedValueCollection }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link FormattedValueCollection }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/xrm/2011/Contracts", name = "FormattedValueCollection")
    public JAXBElement<FormattedValueCollection> createFormattedValueCollection(FormattedValueCollection value) {
        return new JAXBElement<FormattedValueCollection>(_FormattedValueCollection_QNAME,
            FormattedValueCollection.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RelatedEntityCollection }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link RelatedEntityCollection }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/xrm/2011/Contracts", name = "RelatedEntityCollection")
    public JAXBElement<RelatedEntityCollection> createRelatedEntityCollection(RelatedEntityCollection value) {
        return new JAXBElement<RelatedEntityCollection>(_RelatedEntityCollection_QNAME, RelatedEntityCollection.class,
            null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link KeyValuePairOfstringanyType }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link KeyValuePairOfstringanyType }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/System.Collections.Generic", name = "KeyValuePairOfstringanyType")
    public JAXBElement<KeyValuePairOfstringanyType> createKeyValuePairOfstringanyType(
        KeyValuePairOfstringanyType value) {
        return new JAXBElement<KeyValuePairOfstringanyType>(_KeyValuePairOfstringanyType_QNAME,
            KeyValuePairOfstringanyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link KeyValuePairOfRelationshipQueryBaseXPsK4FkN }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link KeyValuePairOfRelationshipQueryBaseXPsK4FkN }{@code
     * >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/System.Collections.Generic", name = "KeyValuePairOfRelationshipQueryBaseX_PsK4FkN")
    public JAXBElement<KeyValuePairOfRelationshipQueryBaseXPsK4FkN> createKeyValuePairOfRelationshipQueryBaseXPsK4FkN(
        KeyValuePairOfRelationshipQueryBaseXPsK4FkN value) {
        return new JAXBElement<KeyValuePairOfRelationshipQueryBaseXPsK4FkN>(
            _KeyValuePairOfRelationshipQueryBaseXPsK4FkN_QNAME, KeyValuePairOfRelationshipQueryBaseXPsK4FkN.class, null,
            value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link KeyValuePairOfDeletedMetadataFiltersArrayOfguidPlUvPKtF
     * }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link KeyValuePairOfDeletedMetadataFiltersArrayOfguidPlUvPKtF
     * }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/System.Collections.Generic", name = "KeyValuePairOfDeletedMetadataFiltersArrayOfguidPlUv_PKtF")
    public JAXBElement<KeyValuePairOfDeletedMetadataFiltersArrayOfguidPlUvPKtF> createKeyValuePairOfDeletedMetadataFiltersArrayOfguidPlUvPKtF(
        KeyValuePairOfDeletedMetadataFiltersArrayOfguidPlUvPKtF value) {
        return new JAXBElement<KeyValuePairOfDeletedMetadataFiltersArrayOfguidPlUvPKtF>(
            _KeyValuePairOfDeletedMetadataFiltersArrayOfguidPlUvPKtF_QNAME,
            KeyValuePairOfDeletedMetadataFiltersArrayOfguidPlUvPKtF.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link KeyValuePairOfEndpointTypestringyDL0RVHi }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link KeyValuePairOfEndpointTypestringyDL0RVHi }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/System.Collections.Generic", name = "KeyValuePairOfEndpointTypestringyDL0RVHi")
    public JAXBElement<KeyValuePairOfEndpointTypestringyDL0RVHi> createKeyValuePairOfEndpointTypestringyDL0RVHi(
        KeyValuePairOfEndpointTypestringyDL0RVHi value) {
        return new JAXBElement<KeyValuePairOfEndpointTypestringyDL0RVHi>(
            _KeyValuePairOfEndpointTypestringyDL0RVHi_QNAME, KeyValuePairOfEndpointTypestringyDL0RVHi.class, null,
            value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfKeyValuePairOfstringanyType }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link ArrayOfKeyValuePairOfstringanyType }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/System.Collections.Generic", name = "ArrayOfKeyValuePairOfstringanyType")
    public JAXBElement<ArrayOfKeyValuePairOfstringanyType> createArrayOfKeyValuePairOfstringanyType(
        ArrayOfKeyValuePairOfstringanyType value) {
        return new JAXBElement<ArrayOfKeyValuePairOfstringanyType>(_ArrayOfKeyValuePairOfstringanyType_QNAME,
            ArrayOfKeyValuePairOfstringanyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link KeyValuePairOfstringQueryBasegUGIFE1S }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link KeyValuePairOfstringQueryBasegUGIFE1S }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/System.Collections.Generic", name = "KeyValuePairOfstringQueryBasegUGIFE1S")
    public JAXBElement<KeyValuePairOfstringQueryBasegUGIFE1S> createKeyValuePairOfstringQueryBasegUGIFE1S(
        KeyValuePairOfstringQueryBasegUGIFE1S value) {
        return new JAXBElement<KeyValuePairOfstringQueryBasegUGIFE1S>(_KeyValuePairOfstringQueryBasegUGIFE1S_QNAME,
            KeyValuePairOfstringQueryBasegUGIFE1S.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link KeyValuePairOfstringstring }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link KeyValuePairOfstringstring }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/System.Collections.Generic", name = "KeyValuePairOfstringstring")
    public JAXBElement<KeyValuePairOfstringstring> createKeyValuePairOfstringstring(KeyValuePairOfstringstring value) {
        return new JAXBElement<KeyValuePairOfstringstring>(_KeyValuePairOfstringstring_QNAME,
            KeyValuePairOfstringstring.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link KeyValuePairOfRelationshipEntityCollectionXPsK4FkN
     * }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link KeyValuePairOfRelationshipEntityCollectionXPsK4FkN
     * }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/System.Collections.Generic", name = "KeyValuePairOfRelationshipEntityCollectionX_PsK4FkN")
    public JAXBElement<KeyValuePairOfRelationshipEntityCollectionXPsK4FkN> createKeyValuePairOfRelationshipEntityCollectionXPsK4FkN(
        KeyValuePairOfRelationshipEntityCollectionXPsK4FkN value) {
        return new JAXBElement<KeyValuePairOfRelationshipEntityCollectionXPsK4FkN>(
            _KeyValuePairOfRelationshipEntityCollectionXPsK4FkN_QNAME,
            KeyValuePairOfRelationshipEntityCollectionXPsK4FkN.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfboolean }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link ArrayOfboolean }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/Arrays", name = "ArrayOfboolean")
    public JAXBElement<ArrayOfboolean> createArrayOfboolean(ArrayOfboolean value) {
        return new JAXBElement<ArrayOfboolean>(_ArrayOfboolean_QNAME, ArrayOfboolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfint }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link ArrayOfint }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/Arrays", name = "ArrayOfint")
    public JAXBElement<ArrayOfint> createArrayOfint(ArrayOfint value) {
        return new JAXBElement<ArrayOfint>(_ArrayOfint_QNAME, ArrayOfint.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/Arrays", name = "ArrayOfstring")
    public JAXBElement<ArrayOfstring> createArrayOfstring(ArrayOfstring value) {
        return new JAXBElement<ArrayOfstring>(_ArrayOfstring_QNAME, ArrayOfstring.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfArrayOfstring }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link ArrayOfArrayOfstring }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/Arrays", name = "ArrayOfArrayOfstring")
    public JAXBElement<ArrayOfArrayOfstring> createArrayOfArrayOfstring(ArrayOfArrayOfstring value) {
        return new JAXBElement<ArrayOfArrayOfstring>(_ArrayOfArrayOfstring_QNAME, ArrayOfArrayOfstring.class, null,
            value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfdouble }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link ArrayOfdouble }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/Arrays", name = "ArrayOfdouble")
    public JAXBElement<ArrayOfdouble> createArrayOfdouble(ArrayOfdouble value) {
        return new JAXBElement<ArrayOfdouble>(_ArrayOfdouble_QNAME, ArrayOfdouble.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfdecimal }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link ArrayOfdecimal }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/Arrays", name = "ArrayOfdecimal")
    public JAXBElement<ArrayOfdecimal> createArrayOfdecimal(ArrayOfdecimal value) {
        return new JAXBElement<ArrayOfdecimal>(_ArrayOfdecimal_QNAME, ArrayOfdecimal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfguid }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link ArrayOfguid }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/Arrays", name = "ArrayOfguid")
    public JAXBElement<ArrayOfguid> createArrayOfguid(ArrayOfguid value) {
        return new JAXBElement<ArrayOfguid>(_ArrayOfguid_QNAME, ArrayOfguid.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfdateTime }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link ArrayOfdateTime }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/Arrays", name = "ArrayOfdateTime")
    public JAXBElement<ArrayOfdateTime> createArrayOfdateTime(ArrayOfdateTime value) {
        return new JAXBElement<ArrayOfdateTime>(_ArrayOfdateTime_QNAME, ArrayOfdateTime.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfKeyValueOfstringstring }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link ArrayOfKeyValueOfstringstring }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/Arrays", name = "ArrayOfKeyValueOfstringstring")
    public JAXBElement<ArrayOfKeyValueOfstringstring> createArrayOfKeyValueOfstringstring(
        ArrayOfKeyValueOfstringstring value) {
        return new JAXBElement<ArrayOfKeyValueOfstringstring>(_ArrayOfKeyValueOfstringstring_QNAME,
            ArrayOfKeyValueOfstringstring.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfanyType }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link ArrayOfanyType }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/Arrays", name = "ArrayOfanyType")
    public JAXBElement<ArrayOfanyType> createArrayOfanyType(ArrayOfanyType value) {
        return new JAXBElement<ArrayOfanyType>(_ArrayOfanyType_QNAME, ArrayOfanyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfKeyValueOfintstring }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link ArrayOfKeyValueOfintstring }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/Arrays", name = "ArrayOfKeyValueOfintstring")
    public JAXBElement<ArrayOfKeyValueOfintstring> createArrayOfKeyValueOfintstring(ArrayOfKeyValueOfintstring value) {
        return new JAXBElement<ArrayOfKeyValueOfintstring>(_ArrayOfKeyValueOfintstring_QNAME,
            ArrayOfKeyValueOfintstring.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MetadataBase }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link MetadataBase }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/xrm/2011/Metadata", name = "MetadataBase")
    public JAXBElement<MetadataBase> createMetadataBase(MetadataBase value) {
        return new JAXBElement<MetadataBase>(_MetadataBase_QNAME, MetadataBase.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RelationshipMetadataBase }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link RelationshipMetadataBase }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/xrm/2011/Metadata", name = "RelationshipMetadataBase")
    public JAXBElement<RelationshipMetadataBase> createRelationshipMetadataBase(RelationshipMetadataBase value) {
        return new JAXBElement<RelationshipMetadataBase>(_RelationshipMetadataBase_QNAME,
            RelationshipMetadataBase.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AttributeRequiredLevel }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link AttributeRequiredLevel }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/xrm/2011/Metadata", name = "AttributeRequiredLevel")
    public JAXBElement<AttributeRequiredLevel> createAttributeRequiredLevel(AttributeRequiredLevel value) {
        return new JAXBElement<AttributeRequiredLevel>(_AttributeRequiredLevel_QNAME, AttributeRequiredLevel.class,
            null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link List }{@code <}{@link String }{@code >}{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link List }{@code <}{@link String }{@code >}{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/xrm/2011/Metadata", name = "SecurityTypes")
    public JAXBElement<List<String>> createSecurityTypes(List<String> value) {
        return new JAXBElement<List<String>>(_SecurityTypes_QNAME, ((Class) List.class), null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RelationshipType }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link RelationshipType }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/xrm/2011/Metadata", name = "RelationshipType")
    public JAXBElement<RelationshipType> createRelationshipType(RelationshipType value) {
        return new JAXBElement<RelationshipType>(_RelationshipType_QNAME, RelationshipType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OneToManyRelationshipMetadata }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link OneToManyRelationshipMetadata }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/xrm/2011/Metadata", name = "OneToManyRelationshipMetadata")
    public JAXBElement<OneToManyRelationshipMetadata> createOneToManyRelationshipMetadata(
        OneToManyRelationshipMetadata value) {
        return new JAXBElement<OneToManyRelationshipMetadata>(_OneToManyRelationshipMetadata_QNAME,
            OneToManyRelationshipMetadata.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AssociatedMenuConfiguration }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link AssociatedMenuConfiguration }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/xrm/2011/Metadata", name = "AssociatedMenuConfiguration")
    public JAXBElement<AssociatedMenuConfiguration> createAssociatedMenuConfiguration(
        AssociatedMenuConfiguration value) {
        return new JAXBElement<AssociatedMenuConfiguration>(_AssociatedMenuConfiguration_QNAME,
            AssociatedMenuConfiguration.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AssociatedMenuBehavior }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link AssociatedMenuBehavior }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/xrm/2011/Metadata", name = "AssociatedMenuBehavior")
    public JAXBElement<AssociatedMenuBehavior> createAssociatedMenuBehavior(AssociatedMenuBehavior value) {
        return new JAXBElement<AssociatedMenuBehavior>(_AssociatedMenuBehavior_QNAME, AssociatedMenuBehavior.class,
            null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AssociatedMenuGroup }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link AssociatedMenuGroup }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/xrm/2011/Metadata", name = "AssociatedMenuGroup")
    public JAXBElement<AssociatedMenuGroup> createAssociatedMenuGroup(AssociatedMenuGroup value) {
        return new JAXBElement<AssociatedMenuGroup>(_AssociatedMenuGroup_QNAME, AssociatedMenuGroup.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CascadeConfiguration }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link CascadeConfiguration }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/xrm/2011/Metadata", name = "CascadeConfiguration")
    public JAXBElement<CascadeConfiguration> createCascadeConfiguration(CascadeConfiguration value) {
        return new JAXBElement<CascadeConfiguration>(_CascadeConfiguration_QNAME, CascadeConfiguration.class, null,
            value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CascadeType }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link CascadeType }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/xrm/2011/Metadata", name = "CascadeType")
    public JAXBElement<CascadeType> createCascadeType(CascadeType value) {
        return new JAXBElement<CascadeType>(_CascadeType_QNAME, CascadeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ManyToManyRelationshipMetadata }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link ManyToManyRelationshipMetadata }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/xrm/2011/Metadata", name = "ManyToManyRelationshipMetadata")
    public JAXBElement<ManyToManyRelationshipMetadata> createManyToManyRelationshipMetadata(
        ManyToManyRelationshipMetadata value) {
        return new JAXBElement<ManyToManyRelationshipMetadata>(_ManyToManyRelationshipMetadata_QNAME,
            ManyToManyRelationshipMetadata.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AttributeMetadata }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link AttributeMetadata }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/xrm/2011/Metadata", name = "AttributeMetadata")
    public JAXBElement<AttributeMetadata> createAttributeMetadata(AttributeMetadata value) {
        return new JAXBElement<AttributeMetadata>(_AttributeMetadata_QNAME, AttributeMetadata.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AttributeTypeCode }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link AttributeTypeCode }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/xrm/2011/Metadata", name = "AttributeTypeCode")
    public JAXBElement<AttributeTypeCode> createAttributeTypeCode(AttributeTypeCode value) {
        return new JAXBElement<AttributeTypeCode>(_AttributeTypeCode_QNAME, AttributeTypeCode.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AttributeRequiredLevelManagedProperty }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link AttributeRequiredLevelManagedProperty }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/xrm/2011/Metadata", name = "AttributeRequiredLevelManagedProperty")
    public JAXBElement<AttributeRequiredLevelManagedProperty> createAttributeRequiredLevelManagedProperty(
        AttributeRequiredLevelManagedProperty value) {
        return new JAXBElement<AttributeRequiredLevelManagedProperty>(_AttributeRequiredLevelManagedProperty_QNAME,
            AttributeRequiredLevelManagedProperty.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DateTimeAttributeMetadata }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link DateTimeAttributeMetadata }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/xrm/2011/Metadata", name = "DateTimeAttributeMetadata")
    public JAXBElement<DateTimeAttributeMetadata> createDateTimeAttributeMetadata(DateTimeAttributeMetadata value) {
        return new JAXBElement<DateTimeAttributeMetadata>(_DateTimeAttributeMetadata_QNAME,
            DateTimeAttributeMetadata.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DateTimeFormat }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link DateTimeFormat }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/xrm/2011/Metadata", name = "DateTimeFormat")
    public JAXBElement<DateTimeFormat> createDateTimeFormat(DateTimeFormat value) {
        return new JAXBElement<DateTimeFormat>(_DateTimeFormat_QNAME, DateTimeFormat.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ImeMode }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link ImeMode }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/xrm/2011/Metadata", name = "ImeMode")
    public JAXBElement<ImeMode> createImeMode(ImeMode value) {
        return new JAXBElement<ImeMode>(_ImeMode_QNAME, ImeMode.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PicklistAttributeMetadata }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link PicklistAttributeMetadata }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/xrm/2011/Metadata", name = "PicklistAttributeMetadata")
    public JAXBElement<PicklistAttributeMetadata> createPicklistAttributeMetadata(PicklistAttributeMetadata value) {
        return new JAXBElement<PicklistAttributeMetadata>(_PicklistAttributeMetadata_QNAME,
            PicklistAttributeMetadata.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnumAttributeMetadata }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link EnumAttributeMetadata }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/xrm/2011/Metadata", name = "EnumAttributeMetadata")
    public JAXBElement<EnumAttributeMetadata> createEnumAttributeMetadata(EnumAttributeMetadata value) {
        return new JAXBElement<EnumAttributeMetadata>(_EnumAttributeMetadata_QNAME, EnumAttributeMetadata.class, null,
            value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OptionSetMetadata }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link OptionSetMetadata }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/xrm/2011/Metadata", name = "OptionSetMetadata")
    public JAXBElement<OptionSetMetadata> createOptionSetMetadata(OptionSetMetadata value) {
        return new JAXBElement<OptionSetMetadata>(_OptionSetMetadata_QNAME, OptionSetMetadata.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OptionSetMetadataBase }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link OptionSetMetadataBase }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/xrm/2011/Metadata", name = "OptionSetMetadataBase")
    public JAXBElement<OptionSetMetadataBase> createOptionSetMetadataBase(OptionSetMetadataBase value) {
        return new JAXBElement<OptionSetMetadataBase>(_OptionSetMetadataBase_QNAME, OptionSetMetadataBase.class, null,
            value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OptionSetType }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link OptionSetType }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/xrm/2011/Metadata", name = "OptionSetType")
    public JAXBElement<OptionSetType> createOptionSetType(OptionSetType value) {
        return new JAXBElement<OptionSetType>(_OptionSetType_QNAME, OptionSetType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BooleanOptionSetMetadata }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link BooleanOptionSetMetadata }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/xrm/2011/Metadata", name = "BooleanOptionSetMetadata")
    public JAXBElement<BooleanOptionSetMetadata> createBooleanOptionSetMetadata(BooleanOptionSetMetadata value) {
        return new JAXBElement<BooleanOptionSetMetadata>(_BooleanOptionSetMetadata_QNAME,
            BooleanOptionSetMetadata.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OptionMetadata }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link OptionMetadata }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/xrm/2011/Metadata", name = "OptionMetadata")
    public JAXBElement<OptionMetadata> createOptionMetadata(OptionMetadata value) {
        return new JAXBElement<OptionMetadata>(_OptionMetadata_QNAME, OptionMetadata.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StatusOptionMetadata }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link StatusOptionMetadata }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/xrm/2011/Metadata", name = "StatusOptionMetadata")
    public JAXBElement<StatusOptionMetadata> createStatusOptionMetadata(StatusOptionMetadata value) {
        return new JAXBElement<StatusOptionMetadata>(_StatusOptionMetadata_QNAME, StatusOptionMetadata.class, null,
            value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StateOptionMetadata }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link StateOptionMetadata }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/xrm/2011/Metadata", name = "StateOptionMetadata")
    public JAXBElement<StateOptionMetadata> createStateOptionMetadata(StateOptionMetadata value) {
        return new JAXBElement<StateOptionMetadata>(_StateOptionMetadata_QNAME, StateOptionMetadata.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EntityNameAttributeMetadata }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link EntityNameAttributeMetadata }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/xrm/2011/Metadata", name = "EntityNameAttributeMetadata")
    public JAXBElement<EntityNameAttributeMetadata> createEntityNameAttributeMetadata(
        EntityNameAttributeMetadata value) {
        return new JAXBElement<EntityNameAttributeMetadata>(_EntityNameAttributeMetadata_QNAME,
            EntityNameAttributeMetadata.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StateAttributeMetadata }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link StateAttributeMetadata }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/xrm/2011/Metadata", name = "StateAttributeMetadata")
    public JAXBElement<StateAttributeMetadata> createStateAttributeMetadata(StateAttributeMetadata value) {
        return new JAXBElement<StateAttributeMetadata>(_StateAttributeMetadata_QNAME, StateAttributeMetadata.class,
            null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StatusAttributeMetadata }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link StatusAttributeMetadata }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/xrm/2011/Metadata", name = "StatusAttributeMetadata")
    public JAXBElement<StatusAttributeMetadata> createStatusAttributeMetadata(StatusAttributeMetadata value) {
        return new JAXBElement<StatusAttributeMetadata>(_StatusAttributeMetadata_QNAME, StatusAttributeMetadata.class,
            null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LookupAttributeMetadata }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link LookupAttributeMetadata }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/xrm/2011/Metadata", name = "LookupAttributeMetadata")
    public JAXBElement<LookupAttributeMetadata> createLookupAttributeMetadata(LookupAttributeMetadata value) {
        return new JAXBElement<LookupAttributeMetadata>(_LookupAttributeMetadata_QNAME, LookupAttributeMetadata.class,
            null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BooleanAttributeMetadata }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link BooleanAttributeMetadata }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/xrm/2011/Metadata", name = "BooleanAttributeMetadata")
    public JAXBElement<BooleanAttributeMetadata> createBooleanAttributeMetadata(BooleanAttributeMetadata value) {
        return new JAXBElement<BooleanAttributeMetadata>(_BooleanAttributeMetadata_QNAME,
            BooleanAttributeMetadata.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DecimalAttributeMetadata }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link DecimalAttributeMetadata }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/xrm/2011/Metadata", name = "DecimalAttributeMetadata")
    public JAXBElement<DecimalAttributeMetadata> createDecimalAttributeMetadata(DecimalAttributeMetadata value) {
        return new JAXBElement<DecimalAttributeMetadata>(_DecimalAttributeMetadata_QNAME,
            DecimalAttributeMetadata.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DoubleAttributeMetadata }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link DoubleAttributeMetadata }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/xrm/2011/Metadata", name = "DoubleAttributeMetadata")
    public JAXBElement<DoubleAttributeMetadata> createDoubleAttributeMetadata(DoubleAttributeMetadata value) {
        return new JAXBElement<DoubleAttributeMetadata>(_DoubleAttributeMetadata_QNAME, DoubleAttributeMetadata.class,
            null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ManagedPropertyAttributeMetadata }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link ManagedPropertyAttributeMetadata }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/xrm/2011/Metadata", name = "ManagedPropertyAttributeMetadata")
    public JAXBElement<ManagedPropertyAttributeMetadata> createManagedPropertyAttributeMetadata(
        ManagedPropertyAttributeMetadata value) {
        return new JAXBElement<ManagedPropertyAttributeMetadata>(_ManagedPropertyAttributeMetadata_QNAME,
            ManagedPropertyAttributeMetadata.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IntegerAttributeMetadata }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link IntegerAttributeMetadata }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/xrm/2011/Metadata", name = "IntegerAttributeMetadata")
    public JAXBElement<IntegerAttributeMetadata> createIntegerAttributeMetadata(IntegerAttributeMetadata value) {
        return new JAXBElement<IntegerAttributeMetadata>(_IntegerAttributeMetadata_QNAME,
            IntegerAttributeMetadata.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IntegerFormat }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link IntegerFormat }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/xrm/2011/Metadata", name = "IntegerFormat")
    public JAXBElement<IntegerFormat> createIntegerFormat(IntegerFormat value) {
        return new JAXBElement<IntegerFormat>(_IntegerFormat_QNAME, IntegerFormat.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigIntAttributeMetadata }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link BigIntAttributeMetadata }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/xrm/2011/Metadata", name = "BigIntAttributeMetadata")
    public JAXBElement<BigIntAttributeMetadata> createBigIntAttributeMetadata(BigIntAttributeMetadata value) {
        return new JAXBElement<BigIntAttributeMetadata>(_BigIntAttributeMetadata_QNAME, BigIntAttributeMetadata.class,
            null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MemoAttributeMetadata }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link MemoAttributeMetadata }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/xrm/2011/Metadata", name = "MemoAttributeMetadata")
    public JAXBElement<MemoAttributeMetadata> createMemoAttributeMetadata(MemoAttributeMetadata value) {
        return new JAXBElement<MemoAttributeMetadata>(_MemoAttributeMetadata_QNAME, MemoAttributeMetadata.class, null,
            value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StringFormat }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link StringFormat }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/xrm/2011/Metadata", name = "StringFormat")
    public JAXBElement<StringFormat> createStringFormat(StringFormat value) {
        return new JAXBElement<StringFormat>(_StringFormat_QNAME, StringFormat.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MoneyAttributeMetadata }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link MoneyAttributeMetadata }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/xrm/2011/Metadata", name = "MoneyAttributeMetadata")
    public JAXBElement<MoneyAttributeMetadata> createMoneyAttributeMetadata(MoneyAttributeMetadata value) {
        return new JAXBElement<MoneyAttributeMetadata>(_MoneyAttributeMetadata_QNAME, MoneyAttributeMetadata.class,
            null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StringAttributeMetadata }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link StringAttributeMetadata }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/xrm/2011/Metadata", name = "StringAttributeMetadata")
    public JAXBElement<StringAttributeMetadata> createStringAttributeMetadata(StringAttributeMetadata value) {
        return new JAXBElement<StringAttributeMetadata>(_StringAttributeMetadata_QNAME, StringAttributeMetadata.class,
            null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EntityMetadata }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link EntityMetadata }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/xrm/2011/Metadata", name = "EntityMetadata")
    public JAXBElement<EntityMetadata> createEntityMetadata(EntityMetadata value) {
        return new JAXBElement<EntityMetadata>(_EntityMetadata_QNAME, EntityMetadata.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfAttributeMetadata }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link ArrayOfAttributeMetadata }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/xrm/2011/Metadata", name = "ArrayOfAttributeMetadata")
    public JAXBElement<ArrayOfAttributeMetadata> createArrayOfAttributeMetadata(ArrayOfAttributeMetadata value) {
        return new JAXBElement<ArrayOfAttributeMetadata>(_ArrayOfAttributeMetadata_QNAME,
            ArrayOfAttributeMetadata.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfManyToManyRelationshipMetadata }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link ArrayOfManyToManyRelationshipMetadata }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/xrm/2011/Metadata", name = "ArrayOfManyToManyRelationshipMetadata")
    public JAXBElement<ArrayOfManyToManyRelationshipMetadata> createArrayOfManyToManyRelationshipMetadata(
        ArrayOfManyToManyRelationshipMetadata value) {
        return new JAXBElement<ArrayOfManyToManyRelationshipMetadata>(_ArrayOfManyToManyRelationshipMetadata_QNAME,
            ArrayOfManyToManyRelationshipMetadata.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfOneToManyRelationshipMetadata }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link ArrayOfOneToManyRelationshipMetadata }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/xrm/2011/Metadata", name = "ArrayOfOneToManyRelationshipMetadata")
    public JAXBElement<ArrayOfOneToManyRelationshipMetadata> createArrayOfOneToManyRelationshipMetadata(
        ArrayOfOneToManyRelationshipMetadata value) {
        return new JAXBElement<ArrayOfOneToManyRelationshipMetadata>(_ArrayOfOneToManyRelationshipMetadata_QNAME,
            ArrayOfOneToManyRelationshipMetadata.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link List }{@code <}{@link String }{@code >}{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link List }{@code <}{@link String }{@code >}{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/xrm/2011/Metadata", name = "OwnershipTypes")
    public JAXBElement<List<String>> createOwnershipTypes(List<String> value) {
        return new JAXBElement<List<String>>(_OwnershipTypes_QNAME, ((Class) List.class), null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfSecurityPrivilegeMetadata }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link ArrayOfSecurityPrivilegeMetadata }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/xrm/2011/Metadata", name = "ArrayOfSecurityPrivilegeMetadata")
    public JAXBElement<ArrayOfSecurityPrivilegeMetadata> createArrayOfSecurityPrivilegeMetadata(
        ArrayOfSecurityPrivilegeMetadata value) {
        return new JAXBElement<ArrayOfSecurityPrivilegeMetadata>(_ArrayOfSecurityPrivilegeMetadata_QNAME,
            ArrayOfSecurityPrivilegeMetadata.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SecurityPrivilegeMetadata }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link SecurityPrivilegeMetadata }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/xrm/2011/Metadata", name = "SecurityPrivilegeMetadata")
    public JAXBElement<SecurityPrivilegeMetadata> createSecurityPrivilegeMetadata(SecurityPrivilegeMetadata value) {
        return new JAXBElement<SecurityPrivilegeMetadata>(_SecurityPrivilegeMetadata_QNAME,
            SecurityPrivilegeMetadata.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PrivilegeType }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link PrivilegeType }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/xrm/2011/Metadata", name = "PrivilegeType")
    public JAXBElement<PrivilegeType> createPrivilegeType(PrivilegeType value) {
        return new JAXBElement<PrivilegeType>(_PrivilegeType_QNAME, PrivilegeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfOptionMetadata }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link ArrayOfOptionMetadata }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/xrm/2011/Metadata", name = "ArrayOfOptionMetadata")
    public JAXBElement<ArrayOfOptionMetadata> createArrayOfOptionMetadata(ArrayOfOptionMetadata value) {
        return new JAXBElement<ArrayOfOptionMetadata>(_ArrayOfOptionMetadata_QNAME, ArrayOfOptionMetadata.class, null,
            value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfEntityMetadata }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link ArrayOfEntityMetadata }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/xrm/2011/Metadata", name = "ArrayOfEntityMetadata")
    public JAXBElement<ArrayOfEntityMetadata> createArrayOfEntityMetadata(ArrayOfEntityMetadata value) {
        return new JAXBElement<ArrayOfEntityMetadata>(_ArrayOfEntityMetadata_QNAME, ArrayOfEntityMetadata.class, null,
            value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfRelationshipMetadataBase }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link ArrayOfRelationshipMetadataBase }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/xrm/2011/Metadata", name = "ArrayOfRelationshipMetadataBase")
    public JAXBElement<ArrayOfRelationshipMetadataBase> createArrayOfRelationshipMetadataBase(
        ArrayOfRelationshipMetadataBase value) {
        return new JAXBElement<ArrayOfRelationshipMetadataBase>(_ArrayOfRelationshipMetadataBase_QNAME,
            ArrayOfRelationshipMetadataBase.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link List }{@code <}{@link String }{@code >}{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link List }{@code <}{@link String }{@code >}{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/xrm/2011/Metadata", name = "EntityFilters")
    public JAXBElement<List<String>> createEntityFilters(List<String> value) {
        return new JAXBElement<List<String>>(_EntityFilters_QNAME, ((Class) List.class), null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfOptionSetMetadataBase }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link ArrayOfOptionSetMetadataBase }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/xrm/2011/Metadata", name = "ArrayOfOptionSetMetadataBase")
    public JAXBElement<ArrayOfOptionSetMetadataBase> createArrayOfOptionSetMetadataBase(
        ArrayOfOptionSetMetadataBase value) {
        return new JAXBElement<ArrayOfOptionSetMetadataBase>(_ArrayOfOptionSetMetadataBase_QNAME,
            ArrayOfOptionSetMetadataBase.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ManagedPropertyMetadata }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link ManagedPropertyMetadata }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/xrm/2011/Metadata", name = "ManagedPropertyMetadata")
    public JAXBElement<ManagedPropertyMetadata> createManagedPropertyMetadata(ManagedPropertyMetadata value) {
        return new JAXBElement<ManagedPropertyMetadata>(_ManagedPropertyMetadata_QNAME, ManagedPropertyMetadata.class,
            null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ManagedPropertyEvaluationPriority }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link ManagedPropertyEvaluationPriority }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/xrm/2011/Metadata", name = "ManagedPropertyEvaluationPriority")
    public JAXBElement<ManagedPropertyEvaluationPriority> createManagedPropertyEvaluationPriority(
        ManagedPropertyEvaluationPriority value) {
        return new JAXBElement<ManagedPropertyEvaluationPriority>(_ManagedPropertyEvaluationPriority_QNAME,
            ManagedPropertyEvaluationPriority.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ManagedPropertyType }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link ManagedPropertyType }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/xrm/2011/Metadata", name = "ManagedPropertyType")
    public JAXBElement<ManagedPropertyType> createManagedPropertyType(ManagedPropertyType value) {
        return new JAXBElement<ManagedPropertyType>(_ManagedPropertyType_QNAME, ManagedPropertyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ManagedPropertyOperation }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link ManagedPropertyOperation }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/xrm/2011/Metadata", name = "ManagedPropertyOperation")
    public JAXBElement<ManagedPropertyOperation> createManagedPropertyOperation(ManagedPropertyOperation value) {
        return new JAXBElement<ManagedPropertyOperation>(_ManagedPropertyOperation_QNAME,
            ManagedPropertyOperation.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfManagedPropertyMetadata }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link ArrayOfManagedPropertyMetadata }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/xrm/2011/Metadata", name = "ArrayOfManagedPropertyMetadata")
    public JAXBElement<ArrayOfManagedPropertyMetadata> createArrayOfManagedPropertyMetadata(
        ArrayOfManagedPropertyMetadata value) {
        return new JAXBElement<ArrayOfManagedPropertyMetadata>(_ArrayOfManagedPropertyMetadata_QNAME,
            ArrayOfManagedPropertyMetadata.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfStringFormat }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link ArrayOfStringFormat }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/xrm/2011/Metadata", name = "ArrayOfStringFormat")
    public JAXBElement<ArrayOfStringFormat> createArrayOfStringFormat(ArrayOfStringFormat value) {
        return new JAXBElement<ArrayOfStringFormat>(_ArrayOfStringFormat_QNAME, ArrayOfStringFormat.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfAttributeRequiredLevel }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link ArrayOfAttributeRequiredLevel }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/xrm/2011/Metadata", name = "ArrayOfAttributeRequiredLevel")
    public JAXBElement<ArrayOfAttributeRequiredLevel> createArrayOfAttributeRequiredLevel(
        ArrayOfAttributeRequiredLevel value) {
        return new JAXBElement<ArrayOfAttributeRequiredLevel>(_ArrayOfAttributeRequiredLevel_QNAME,
            ArrayOfAttributeRequiredLevel.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfAttributeTypeCode }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link ArrayOfAttributeTypeCode }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/xrm/2011/Metadata", name = "ArrayOfAttributeTypeCode")
    public JAXBElement<ArrayOfAttributeTypeCode> createArrayOfAttributeTypeCode(ArrayOfAttributeTypeCode value) {
        return new JAXBElement<ArrayOfAttributeTypeCode>(_ArrayOfAttributeTypeCode_QNAME,
            ArrayOfAttributeTypeCode.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfCascadeType }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link ArrayOfCascadeType }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/xrm/2011/Metadata", name = "ArrayOfCascadeType")
    public JAXBElement<ArrayOfCascadeType> createArrayOfCascadeType(ArrayOfCascadeType value) {
        return new JAXBElement<ArrayOfCascadeType>(_ArrayOfCascadeType_QNAME, ArrayOfCascadeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfDateTimeFormat }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link ArrayOfDateTimeFormat }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/xrm/2011/Metadata", name = "ArrayOfDateTimeFormat")
    public JAXBElement<ArrayOfDateTimeFormat> createArrayOfDateTimeFormat(ArrayOfDateTimeFormat value) {
        return new JAXBElement<ArrayOfDateTimeFormat>(_ArrayOfDateTimeFormat_QNAME, ArrayOfDateTimeFormat.class, null,
            value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfIntegerFormat }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link ArrayOfIntegerFormat }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/xrm/2011/Metadata", name = "ArrayOfIntegerFormat")
    public JAXBElement<ArrayOfIntegerFormat> createArrayOfIntegerFormat(ArrayOfIntegerFormat value) {
        return new JAXBElement<ArrayOfIntegerFormat>(_ArrayOfIntegerFormat_QNAME, ArrayOfIntegerFormat.class, null,
            value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfManagedPropertyEvaluationPriority }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link ArrayOfManagedPropertyEvaluationPriority }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/xrm/2011/Metadata", name = "ArrayOfManagedPropertyEvaluationPriority")
    public JAXBElement<ArrayOfManagedPropertyEvaluationPriority> createArrayOfManagedPropertyEvaluationPriority(
        ArrayOfManagedPropertyEvaluationPriority value) {
        return new JAXBElement<ArrayOfManagedPropertyEvaluationPriority>(
            _ArrayOfManagedPropertyEvaluationPriority_QNAME, ArrayOfManagedPropertyEvaluationPriority.class, null,
            value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfManagedPropertyOperation }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link ArrayOfManagedPropertyOperation }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/xrm/2011/Metadata", name = "ArrayOfManagedPropertyOperation")
    public JAXBElement<ArrayOfManagedPropertyOperation> createArrayOfManagedPropertyOperation(
        ArrayOfManagedPropertyOperation value) {
        return new JAXBElement<ArrayOfManagedPropertyOperation>(_ArrayOfManagedPropertyOperation_QNAME,
            ArrayOfManagedPropertyOperation.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfManagedPropertyType }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link ArrayOfManagedPropertyType }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/xrm/2011/Metadata", name = "ArrayOfManagedPropertyType")
    public JAXBElement<ArrayOfManagedPropertyType> createArrayOfManagedPropertyType(ArrayOfManagedPropertyType value) {
        return new JAXBElement<ArrayOfManagedPropertyType>(_ArrayOfManagedPropertyType_QNAME,
            ArrayOfManagedPropertyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfSecurityTypes }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link ArrayOfSecurityTypes }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/xrm/2011/Metadata", name = "ArrayOfSecurityTypes")
    public JAXBElement<ArrayOfSecurityTypes> createArrayOfSecurityTypes(ArrayOfSecurityTypes value) {
        return new JAXBElement<ArrayOfSecurityTypes>(_ArrayOfSecurityTypes_QNAME, ArrayOfSecurityTypes.class, null,
            value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfOwnershipTypes }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link ArrayOfOwnershipTypes }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/xrm/2011/Metadata", name = "ArrayOfOwnershipTypes")
    public JAXBElement<ArrayOfOwnershipTypes> createArrayOfOwnershipTypes(ArrayOfOwnershipTypes value) {
        return new JAXBElement<ArrayOfOwnershipTypes>(_ArrayOfOwnershipTypes_QNAME, ArrayOfOwnershipTypes.class, null,
            value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfImeMode }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link ArrayOfImeMode }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/xrm/2011/Metadata", name = "ArrayOfImeMode")
    public JAXBElement<ArrayOfImeMode> createArrayOfImeMode(ArrayOfImeMode value) {
        return new JAXBElement<ArrayOfImeMode>(_ArrayOfImeMode_QNAME, ArrayOfImeMode.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfRelationshipType }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link ArrayOfRelationshipType }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/xrm/2011/Metadata", name = "ArrayOfRelationshipType")
    public JAXBElement<ArrayOfRelationshipType> createArrayOfRelationshipType(ArrayOfRelationshipType value) {
        return new JAXBElement<ArrayOfRelationshipType>(_ArrayOfRelationshipType_QNAME, ArrayOfRelationshipType.class,
            null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AttributeTypeDisplayName }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link AttributeTypeDisplayName }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/xrm/2013/Metadata", name = "AttributeTypeDisplayName")
    public JAXBElement<AttributeTypeDisplayName> createAttributeTypeDisplayName(AttributeTypeDisplayName value) {
        return new JAXBElement<AttributeTypeDisplayName>(_AttributeTypeDisplayName_QNAME,
            AttributeTypeDisplayName.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConstantsBase }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link ConstantsBase }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/xrm/2013/Metadata", name = "ConstantsBase")
    public JAXBElement<ConstantsBase> createConstantsBase(ConstantsBase value) {
        return new JAXBElement<ConstantsBase>(_ConstantsBase_QNAME, ConstantsBase.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StringFormatName }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link StringFormatName }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/xrm/2013/Metadata", name = "StringFormatName")
    public JAXBElement<StringFormatName> createStringFormatName(StringFormatName value) {
        return new JAXBElement<StringFormatName>(_StringFormatName_QNAME, StringFormatName.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ImageAttributeMetadata }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link ImageAttributeMetadata }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/xrm/2013/Metadata", name = "ImageAttributeMetadata")
    public JAXBElement<ImageAttributeMetadata> createImageAttributeMetadata(ImageAttributeMetadata value) {
        return new JAXBElement<ImageAttributeMetadata>(_ImageAttributeMetadata_QNAME, ImageAttributeMetadata.class,
            null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfAttributeTypeDisplayName }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link ArrayOfAttributeTypeDisplayName }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/xrm/2013/Metadata", name = "ArrayOfAttributeTypeDisplayName")
    public JAXBElement<ArrayOfAttributeTypeDisplayName> createArrayOfAttributeTypeDisplayName(
        ArrayOfAttributeTypeDisplayName value) {
        return new JAXBElement<ArrayOfAttributeTypeDisplayName>(_ArrayOfAttributeTypeDisplayName_QNAME,
            ArrayOfAttributeTypeDisplayName.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EndpointAccessType }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link EndpointAccessType }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/xrm/2014/Contracts", name = "EndpointAccessType")
    public JAXBElement<EndpointAccessType> createEndpointAccessType(EndpointAccessType value) {
        return new JAXBElement<EndpointAccessType>(_EndpointAccessType_QNAME, EndpointAccessType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AttributeMapping }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link AttributeMapping }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/xrm/2014/Contracts", name = "AttributeMapping")
    public JAXBElement<AttributeMapping> createAttributeMapping(AttributeMapping value) {
        return new JAXBElement<AttributeMapping>(_AttributeMapping_QNAME, AttributeMapping.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OrganizationDetail }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link OrganizationDetail }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/xrm/2014/Contracts", name = "OrganizationDetail")
    public JAXBElement<OrganizationDetail> createOrganizationDetail(OrganizationDetail value) {
        return new JAXBElement<OrganizationDetail>(_OrganizationDetail_QNAME, OrganizationDetail.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EndpointCollection }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link EndpointCollection }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/xrm/2014/Contracts", name = "EndpointCollection")
    public JAXBElement<EndpointCollection> createEndpointCollection(EndpointCollection value) {
        return new JAXBElement<EndpointCollection>(_EndpointCollection_QNAME, EndpointCollection.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EndpointType }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link EndpointType }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/xrm/2014/Contracts", name = "EndpointType")
    public JAXBElement<EndpointType> createEndpointType(EndpointType value) {
        return new JAXBElement<EndpointType>(_EndpointType_QNAME, EndpointType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OrganizationState }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link OrganizationState }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/xrm/2014/Contracts", name = "OrganizationState")
    public JAXBElement<OrganizationState> createOrganizationState(OrganizationState value) {
        return new JAXBElement<OrganizationState>(_OrganizationState_QNAME, OrganizationState.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MetadataFilterExpression }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link MetadataFilterExpression }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/xrm/2011/Metadata/Query", name = "MetadataFilterExpression")
    public JAXBElement<MetadataFilterExpression> createMetadataFilterExpression(MetadataFilterExpression value) {
        return new JAXBElement<MetadataFilterExpression>(_MetadataFilterExpression_QNAME,
            MetadataFilterExpression.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfMetadataConditionExpression }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link ArrayOfMetadataConditionExpression }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/xrm/2011/Metadata/Query", name = "ArrayOfMetadataConditionExpression")
    public JAXBElement<ArrayOfMetadataConditionExpression> createArrayOfMetadataConditionExpression(
        ArrayOfMetadataConditionExpression value) {
        return new JAXBElement<ArrayOfMetadataConditionExpression>(_ArrayOfMetadataConditionExpression_QNAME,
            ArrayOfMetadataConditionExpression.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MetadataConditionExpression }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link MetadataConditionExpression }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/xrm/2011/Metadata/Query", name = "MetadataConditionExpression")
    public JAXBElement<MetadataConditionExpression> createMetadataConditionExpression(
        MetadataConditionExpression value) {
        return new JAXBElement<MetadataConditionExpression>(_MetadataConditionExpression_QNAME,
            MetadataConditionExpression.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MetadataConditionOperator }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link MetadataConditionOperator }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/xrm/2011/Metadata/Query", name = "MetadataConditionOperator")
    public JAXBElement<MetadataConditionOperator> createMetadataConditionOperator(MetadataConditionOperator value) {
        return new JAXBElement<MetadataConditionOperator>(_MetadataConditionOperator_QNAME,
            MetadataConditionOperator.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfMetadataFilterExpression }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link ArrayOfMetadataFilterExpression }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/xrm/2011/Metadata/Query", name = "ArrayOfMetadataFilterExpression")
    public JAXBElement<ArrayOfMetadataFilterExpression> createArrayOfMetadataFilterExpression(
        ArrayOfMetadataFilterExpression value) {
        return new JAXBElement<ArrayOfMetadataFilterExpression>(_ArrayOfMetadataFilterExpression_QNAME,
            ArrayOfMetadataFilterExpression.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MetadataQueryBase }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link MetadataQueryBase }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/xrm/2011/Metadata/Query", name = "MetadataQueryBase")
    public JAXBElement<MetadataQueryBase> createMetadataQueryBase(MetadataQueryBase value) {
        return new JAXBElement<MetadataQueryBase>(_MetadataQueryBase_QNAME, MetadataQueryBase.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MetadataQueryExpression }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link MetadataQueryExpression }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/xrm/2011/Metadata/Query", name = "MetadataQueryExpression")
    public JAXBElement<MetadataQueryExpression> createMetadataQueryExpression(MetadataQueryExpression value) {
        return new JAXBElement<MetadataQueryExpression>(_MetadataQueryExpression_QNAME, MetadataQueryExpression.class,
            null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MetadataPropertiesExpression }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link MetadataPropertiesExpression }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/xrm/2011/Metadata/Query", name = "MetadataPropertiesExpression")
    public JAXBElement<MetadataPropertiesExpression> createMetadataPropertiesExpression(
        MetadataPropertiesExpression value) {
        return new JAXBElement<MetadataPropertiesExpression>(_MetadataPropertiesExpression_QNAME,
            MetadataPropertiesExpression.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RelationshipQueryExpression }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link RelationshipQueryExpression }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/xrm/2011/Metadata/Query", name = "RelationshipQueryExpression")
    public JAXBElement<RelationshipQueryExpression> createRelationshipQueryExpression(
        RelationshipQueryExpression value) {
        return new JAXBElement<RelationshipQueryExpression>(_RelationshipQueryExpression_QNAME,
            RelationshipQueryExpression.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EntityQueryExpression }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link EntityQueryExpression }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/xrm/2011/Metadata/Query", name = "EntityQueryExpression")
    public JAXBElement<EntityQueryExpression> createEntityQueryExpression(EntityQueryExpression value) {
        return new JAXBElement<EntityQueryExpression>(_EntityQueryExpression_QNAME, EntityQueryExpression.class, null,
            value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AttributeQueryExpression }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link AttributeQueryExpression }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/xrm/2011/Metadata/Query", name = "AttributeQueryExpression")
    public JAXBElement<AttributeQueryExpression> createAttributeQueryExpression(AttributeQueryExpression value) {
        return new JAXBElement<AttributeQueryExpression>(_AttributeQueryExpression_QNAME,
            AttributeQueryExpression.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LabelQueryExpression }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link LabelQueryExpression }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/xrm/2011/Metadata/Query", name = "LabelQueryExpression")
    public JAXBElement<LabelQueryExpression> createLabelQueryExpression(LabelQueryExpression value) {
        return new JAXBElement<LabelQueryExpression>(_LabelQueryExpression_QNAME, LabelQueryExpression.class, null,
            value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link List }{@code <}{@link String }{@code >}{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link List }{@code <}{@link String }{@code >}{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/xrm/2011/Metadata/Query", name = "DeletedMetadataFilters")
    public JAXBElement<List<String>> createDeletedMetadataFilters(List<String> value) {
        return new JAXBElement<List<String>>(_DeletedMetadataFilters_QNAME, ((Class) List.class), null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeletedMetadataCollection }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link DeletedMetadataCollection }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/xrm/2011/Metadata/Query", name = "DeletedMetadataCollection")
    public JAXBElement<DeletedMetadataCollection> createDeletedMetadataCollection(DeletedMetadataCollection value) {
        return new JAXBElement<DeletedMetadataCollection>(_DeletedMetadataCollection_QNAME,
            DeletedMetadataCollection.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExecuteMultipleSettings }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link ExecuteMultipleSettings }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/xrm/2012/Contracts", name = "ExecuteMultipleSettings")
    public JAXBElement<ExecuteMultipleSettings> createExecuteMultipleSettings(ExecuteMultipleSettings value) {
        return new JAXBElement<ExecuteMultipleSettings>(_ExecuteMultipleSettings_QNAME, ExecuteMultipleSettings.class,
            null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OrganizationResponseCollection }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link OrganizationResponseCollection }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/xrm/2012/Contracts", name = "OrganizationResponseCollection")
    public JAXBElement<OrganizationResponseCollection> createOrganizationResponseCollection(
        OrganizationResponseCollection value) {
        return new JAXBElement<OrganizationResponseCollection>(_OrganizationResponseCollection_QNAME,
            OrganizationResponseCollection.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OrganizationRequestCollection }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link OrganizationRequestCollection }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/xrm/2012/Contracts", name = "OrganizationRequestCollection")
    public JAXBElement<OrganizationRequestCollection> createOrganizationRequestCollection(
        OrganizationRequestCollection value) {
        return new JAXBElement<OrganizationRequestCollection>(_OrganizationRequestCollection_QNAME,
            OrganizationRequestCollection.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExecuteMultipleResponseItem }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link ExecuteMultipleResponseItem }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/xrm/2012/Contracts", name = "ExecuteMultipleResponseItem")
    public JAXBElement<ExecuteMultipleResponseItem> createExecuteMultipleResponseItem(
        ExecuteMultipleResponseItem value) {
        return new JAXBElement<ExecuteMultipleResponseItem>(_ExecuteMultipleResponseItem_QNAME,
            ExecuteMultipleResponseItem.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfQuickFindConfiguration }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link ArrayOfQuickFindConfiguration }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Microsoft.Xrm.Sdk", name = "ArrayOfQuickFindConfiguration")
    public JAXBElement<ArrayOfQuickFindConfiguration> createArrayOfQuickFindConfiguration(
        ArrayOfQuickFindConfiguration value) {
        return new JAXBElement<ArrayOfQuickFindConfiguration>(_ArrayOfQuickFindConfiguration_QNAME,
            ArrayOfQuickFindConfiguration.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QuickFindConfiguration }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link QuickFindConfiguration }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Microsoft.Xrm.Sdk", name = "QuickFindConfiguration")
    public JAXBElement<QuickFindConfiguration> createQuickFindConfiguration(QuickFindConfiguration value) {
        return new JAXBElement<QuickFindConfiguration>(_QuickFindConfiguration_QNAME, QuickFindConfiguration.class,
            null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AppointmentProposal }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link AppointmentProposal }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/crm/2011/Contracts", name = "AppointmentProposal")
    public JAXBElement<AppointmentProposal> createAppointmentProposal(AppointmentProposal value) {
        return new JAXBElement<AppointmentProposal>(_AppointmentProposal_QNAME, AppointmentProposal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfProposalParty }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link ArrayOfProposalParty }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/crm/2011/Contracts", name = "ArrayOfProposalParty")
    public JAXBElement<ArrayOfProposalParty> createArrayOfProposalParty(ArrayOfProposalParty value) {
        return new JAXBElement<ArrayOfProposalParty>(_ArrayOfProposalParty_QNAME, ArrayOfProposalParty.class, null,
            value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProposalParty }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link ProposalParty }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/crm/2011/Contracts", name = "ProposalParty")
    public JAXBElement<ProposalParty> createProposalParty(ProposalParty value) {
        return new JAXBElement<ProposalParty>(_ProposalParty_QNAME, ProposalParty.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfAppointmentProposal }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link ArrayOfAppointmentProposal }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/crm/2011/Contracts", name = "ArrayOfAppointmentProposal")
    public JAXBElement<ArrayOfAppointmentProposal> createArrayOfAppointmentProposal(ArrayOfAppointmentProposal value) {
        return new JAXBElement<ArrayOfAppointmentProposal>(_ArrayOfAppointmentProposal_QNAME,
            ArrayOfAppointmentProposal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfArrayOfAppointmentProposal }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link ArrayOfArrayOfAppointmentProposal }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/crm/2011/Contracts", name = "ArrayOfArrayOfAppointmentProposal")
    public JAXBElement<ArrayOfArrayOfAppointmentProposal> createArrayOfArrayOfAppointmentProposal(
        ArrayOfArrayOfAppointmentProposal value) {
        return new JAXBElement<ArrayOfArrayOfAppointmentProposal>(_ArrayOfArrayOfAppointmentProposal_QNAME,
            ArrayOfArrayOfAppointmentProposal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchDirection }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link SearchDirection }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/crm/2011/Contracts", name = "SearchDirection")
    public JAXBElement<SearchDirection> createSearchDirection(SearchDirection value) {
        return new JAXBElement<SearchDirection>(_SearchDirection_QNAME, SearchDirection.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfSearchDirection }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link ArrayOfSearchDirection }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/crm/2011/Contracts", name = "ArrayOfSearchDirection")
    public JAXBElement<ArrayOfSearchDirection> createArrayOfSearchDirection(ArrayOfSearchDirection value) {
        return new JAXBElement<ArrayOfSearchDirection>(_ArrayOfSearchDirection_QNAME, ArrayOfSearchDirection.class,
            null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfArrayOfSearchDirection }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link ArrayOfArrayOfSearchDirection }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/crm/2011/Contracts", name = "ArrayOfArrayOfSearchDirection")
    public JAXBElement<ArrayOfArrayOfSearchDirection> createArrayOfArrayOfSearchDirection(
        ArrayOfArrayOfSearchDirection value) {
        return new JAXBElement<ArrayOfArrayOfSearchDirection>(_ArrayOfArrayOfSearchDirection_QNAME,
            ArrayOfArrayOfSearchDirection.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AppointmentRequest }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link AppointmentRequest }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/crm/2011/Contracts", name = "AppointmentRequest")
    public JAXBElement<AppointmentRequest> createAppointmentRequest(AppointmentRequest value) {
        return new JAXBElement<AppointmentRequest>(_AppointmentRequest_QNAME, AppointmentRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfAppointmentsToIgnore }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link ArrayOfAppointmentsToIgnore }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/crm/2011/Contracts", name = "ArrayOfAppointmentsToIgnore")
    public JAXBElement<ArrayOfAppointmentsToIgnore> createArrayOfAppointmentsToIgnore(
        ArrayOfAppointmentsToIgnore value) {
        return new JAXBElement<ArrayOfAppointmentsToIgnore>(_ArrayOfAppointmentsToIgnore_QNAME,
            ArrayOfAppointmentsToIgnore.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AppointmentsToIgnore }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link AppointmentsToIgnore }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/crm/2011/Contracts", name = "AppointmentsToIgnore")
    public JAXBElement<AppointmentsToIgnore> createAppointmentsToIgnore(AppointmentsToIgnore value) {
        return new JAXBElement<AppointmentsToIgnore>(_AppointmentsToIgnore_QNAME, AppointmentsToIgnore.class, null,
            value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfConstraintRelation }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link ArrayOfConstraintRelation }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/crm/2011/Contracts", name = "ArrayOfConstraintRelation")
    public JAXBElement<ArrayOfConstraintRelation> createArrayOfConstraintRelation(ArrayOfConstraintRelation value) {
        return new JAXBElement<ArrayOfConstraintRelation>(_ArrayOfConstraintRelation_QNAME,
            ArrayOfConstraintRelation.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConstraintRelation }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link ConstraintRelation }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/crm/2011/Contracts", name = "ConstraintRelation")
    public JAXBElement<ConstraintRelation> createConstraintRelation(ConstraintRelation value) {
        return new JAXBElement<ConstraintRelation>(_ConstraintRelation_QNAME, ConstraintRelation.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfObjectiveRelation }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link ArrayOfObjectiveRelation }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/crm/2011/Contracts", name = "ArrayOfObjectiveRelation")
    public JAXBElement<ArrayOfObjectiveRelation> createArrayOfObjectiveRelation(ArrayOfObjectiveRelation value) {
        return new JAXBElement<ArrayOfObjectiveRelation>(_ArrayOfObjectiveRelation_QNAME,
            ArrayOfObjectiveRelation.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObjectiveRelation }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link ObjectiveRelation }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/crm/2011/Contracts", name = "ObjectiveRelation")
    public JAXBElement<ObjectiveRelation> createObjectiveRelation(ObjectiveRelation value) {
        return new JAXBElement<ObjectiveRelation>(_ObjectiveRelation_QNAME, ObjectiveRelation.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfRequiredResource }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link ArrayOfRequiredResource }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/crm/2011/Contracts", name = "ArrayOfRequiredResource")
    public JAXBElement<ArrayOfRequiredResource> createArrayOfRequiredResource(ArrayOfRequiredResource value) {
        return new JAXBElement<ArrayOfRequiredResource>(_ArrayOfRequiredResource_QNAME, ArrayOfRequiredResource.class,
            null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RequiredResource }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link RequiredResource }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/crm/2011/Contracts", name = "RequiredResource")
    public JAXBElement<RequiredResource> createRequiredResource(RequiredResource value) {
        return new JAXBElement<RequiredResource>(_RequiredResource_QNAME, RequiredResource.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfAppointmentRequest }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link ArrayOfAppointmentRequest }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/crm/2011/Contracts", name = "ArrayOfAppointmentRequest")
    public JAXBElement<ArrayOfAppointmentRequest> createArrayOfAppointmentRequest(ArrayOfAppointmentRequest value) {
        return new JAXBElement<ArrayOfAppointmentRequest>(_ArrayOfAppointmentRequest_QNAME,
            ArrayOfAppointmentRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfArrayOfAppointmentRequest }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link ArrayOfArrayOfAppointmentRequest }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/crm/2011/Contracts", name = "ArrayOfArrayOfAppointmentRequest")
    public JAXBElement<ArrayOfArrayOfAppointmentRequest> createArrayOfArrayOfAppointmentRequest(
        ArrayOfArrayOfAppointmentRequest value) {
        return new JAXBElement<ArrayOfArrayOfAppointmentRequest>(_ArrayOfArrayOfAppointmentRequest_QNAME,
            ArrayOfArrayOfAppointmentRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfArrayOfAppointmentsToIgnore }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link ArrayOfArrayOfAppointmentsToIgnore }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/crm/2011/Contracts", name = "ArrayOfArrayOfAppointmentsToIgnore")
    public JAXBElement<ArrayOfArrayOfAppointmentsToIgnore> createArrayOfArrayOfAppointmentsToIgnore(
        ArrayOfArrayOfAppointmentsToIgnore value) {
        return new JAXBElement<ArrayOfArrayOfAppointmentsToIgnore>(_ArrayOfArrayOfAppointmentsToIgnore_QNAME,
            ArrayOfArrayOfAppointmentsToIgnore.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AuditDetail }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link AuditDetail }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/crm/2011/Contracts", name = "AuditDetail")
    public JAXBElement<AuditDetail> createAuditDetail(AuditDetail value) {
        return new JAXBElement<AuditDetail>(_AuditDetail_QNAME, AuditDetail.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AttributeAuditDetail }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link AttributeAuditDetail }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/crm/2011/Contracts", name = "AttributeAuditDetail")
    public JAXBElement<AttributeAuditDetail> createAttributeAuditDetail(AttributeAuditDetail value) {
        return new JAXBElement<AttributeAuditDetail>(_AttributeAuditDetail_QNAME, AttributeAuditDetail.class, null,
            value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ShareAuditDetail }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link ShareAuditDetail }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/crm/2011/Contracts", name = "ShareAuditDetail")
    public JAXBElement<ShareAuditDetail> createShareAuditDetail(ShareAuditDetail value) {
        return new JAXBElement<ShareAuditDetail>(_ShareAuditDetail_QNAME, ShareAuditDetail.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link List }{@code <}{@link String }{@code >}{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link List }{@code <}{@link String }{@code >}{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/crm/2011/Contracts", name = "AccessRights")
    public JAXBElement<List<String>> createAccessRights(List<String> value) {
        return new JAXBElement<List<String>>(_AccessRights_QNAME, ((Class) List.class), null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RelationshipAuditDetail }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link RelationshipAuditDetail }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/crm/2011/Contracts", name = "RelationshipAuditDetail")
    public JAXBElement<RelationshipAuditDetail> createRelationshipAuditDetail(RelationshipAuditDetail value) {
        return new JAXBElement<RelationshipAuditDetail>(_RelationshipAuditDetail_QNAME, RelationshipAuditDetail.class,
            null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfAuditDetail }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link ArrayOfAuditDetail }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/crm/2011/Contracts", name = "ArrayOfAuditDetail")
    public JAXBElement<ArrayOfAuditDetail> createArrayOfAuditDetail(ArrayOfAuditDetail value) {
        return new JAXBElement<ArrayOfAuditDetail>(_ArrayOfAuditDetail_QNAME, ArrayOfAuditDetail.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfArrayOfAuditDetail }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link ArrayOfArrayOfAuditDetail }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/crm/2011/Contracts", name = "ArrayOfArrayOfAuditDetail")
    public JAXBElement<ArrayOfArrayOfAuditDetail> createArrayOfArrayOfAuditDetail(ArrayOfArrayOfAuditDetail value) {
        return new JAXBElement<ArrayOfArrayOfAuditDetail>(_ArrayOfArrayOfAuditDetail_QNAME,
            ArrayOfArrayOfAuditDetail.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfAttributeAuditDetail }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link ArrayOfAttributeAuditDetail }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/crm/2011/Contracts", name = "ArrayOfAttributeAuditDetail")
    public JAXBElement<ArrayOfAttributeAuditDetail> createArrayOfAttributeAuditDetail(
        ArrayOfAttributeAuditDetail value) {
        return new JAXBElement<ArrayOfAttributeAuditDetail>(_ArrayOfAttributeAuditDetail_QNAME,
            ArrayOfAttributeAuditDetail.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfArrayOfAttributeAuditDetail }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link ArrayOfArrayOfAttributeAuditDetail }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/crm/2011/Contracts", name = "ArrayOfArrayOfAttributeAuditDetail")
    public JAXBElement<ArrayOfArrayOfAttributeAuditDetail> createArrayOfArrayOfAttributeAuditDetail(
        ArrayOfArrayOfAttributeAuditDetail value) {
        return new JAXBElement<ArrayOfArrayOfAttributeAuditDetail>(_ArrayOfArrayOfAttributeAuditDetail_QNAME,
            ArrayOfArrayOfAttributeAuditDetail.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AuditDetailCollection }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link AuditDetailCollection }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/crm/2011/Contracts", name = "AuditDetailCollection")
    public JAXBElement<AuditDetailCollection> createAuditDetailCollection(AuditDetailCollection value) {
        return new JAXBElement<AuditDetailCollection>(_AuditDetailCollection_QNAME, AuditDetailCollection.class, null,
            value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfAuditDetailCollection }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link ArrayOfAuditDetailCollection }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/crm/2011/Contracts", name = "ArrayOfAuditDetailCollection")
    public JAXBElement<ArrayOfAuditDetailCollection> createArrayOfAuditDetailCollection(
        ArrayOfAuditDetailCollection value) {
        return new JAXBElement<ArrayOfAuditDetailCollection>(_ArrayOfAuditDetailCollection_QNAME,
            ArrayOfAuditDetailCollection.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfArrayOfAuditDetailCollection }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link ArrayOfArrayOfAuditDetailCollection }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/crm/2011/Contracts", name = "ArrayOfArrayOfAuditDetailCollection")
    public JAXBElement<ArrayOfArrayOfAuditDetailCollection> createArrayOfArrayOfAuditDetailCollection(
        ArrayOfArrayOfAuditDetailCollection value) {
        return new JAXBElement<ArrayOfArrayOfAuditDetailCollection>(_ArrayOfArrayOfAuditDetailCollection_QNAME,
            ArrayOfArrayOfAuditDetailCollection.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AuditPartitionDetail }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link AuditPartitionDetail }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/crm/2011/Contracts", name = "AuditPartitionDetail")
    public JAXBElement<AuditPartitionDetail> createAuditPartitionDetail(AuditPartitionDetail value) {
        return new JAXBElement<AuditPartitionDetail>(_AuditPartitionDetail_QNAME, AuditPartitionDetail.class, null,
            value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfAuditPartitionDetail }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link ArrayOfAuditPartitionDetail }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/crm/2011/Contracts", name = "ArrayOfAuditPartitionDetail")
    public JAXBElement<ArrayOfAuditPartitionDetail> createArrayOfAuditPartitionDetail(
        ArrayOfAuditPartitionDetail value) {
        return new JAXBElement<ArrayOfAuditPartitionDetail>(_ArrayOfAuditPartitionDetail_QNAME,
            ArrayOfAuditPartitionDetail.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfArrayOfAuditPartitionDetail }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link ArrayOfArrayOfAuditPartitionDetail }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/crm/2011/Contracts", name = "ArrayOfArrayOfAuditPartitionDetail")
    public JAXBElement<ArrayOfArrayOfAuditPartitionDetail> createArrayOfArrayOfAuditPartitionDetail(
        ArrayOfArrayOfAuditPartitionDetail value) {
        return new JAXBElement<ArrayOfArrayOfAuditPartitionDetail>(_ArrayOfArrayOfAuditPartitionDetail_QNAME,
            ArrayOfArrayOfAuditPartitionDetail.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AuditPartitionDetailCollection }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link AuditPartitionDetailCollection }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/crm/2011/Contracts", name = "AuditPartitionDetailCollection")
    public JAXBElement<AuditPartitionDetailCollection> createAuditPartitionDetailCollection(
        AuditPartitionDetailCollection value) {
        return new JAXBElement<AuditPartitionDetailCollection>(_AuditPartitionDetailCollection_QNAME,
            AuditPartitionDetailCollection.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfAuditPartitionDetailCollection }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link ArrayOfAuditPartitionDetailCollection }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/crm/2011/Contracts", name = "ArrayOfAuditPartitionDetailCollection")
    public JAXBElement<ArrayOfAuditPartitionDetailCollection> createArrayOfAuditPartitionDetailCollection(
        ArrayOfAuditPartitionDetailCollection value) {
        return new JAXBElement<ArrayOfAuditPartitionDetailCollection>(_ArrayOfAuditPartitionDetailCollection_QNAME,
            ArrayOfAuditPartitionDetailCollection.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfArrayOfAuditPartitionDetailCollection }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link ArrayOfArrayOfAuditPartitionDetailCollection
     * }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/crm/2011/Contracts", name = "ArrayOfArrayOfAuditPartitionDetailCollection")
    public JAXBElement<ArrayOfArrayOfAuditPartitionDetailCollection> createArrayOfArrayOfAuditPartitionDetailCollection(
        ArrayOfArrayOfAuditPartitionDetailCollection value) {
        return new JAXBElement<ArrayOfArrayOfAuditPartitionDetailCollection>(
            _ArrayOfArrayOfAuditPartitionDetailCollection_QNAME, ArrayOfArrayOfAuditPartitionDetailCollection.class,
            null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ComponentDetail }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link ComponentDetail }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/crm/2011/Contracts", name = "ComponentDetail")
    public JAXBElement<ComponentDetail> createComponentDetail(ComponentDetail value) {
        return new JAXBElement<ComponentDetail>(_ComponentDetail_QNAME, ComponentDetail.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfComponentDetail }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link ArrayOfComponentDetail }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/crm/2011/Contracts", name = "ArrayOfComponentDetail")
    public JAXBElement<ArrayOfComponentDetail> createArrayOfComponentDetail(ArrayOfComponentDetail value) {
        return new JAXBElement<ArrayOfComponentDetail>(_ArrayOfComponentDetail_QNAME, ArrayOfComponentDetail.class,
            null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfArrayOfComponentDetail }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link ArrayOfArrayOfComponentDetail }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/crm/2011/Contracts", name = "ArrayOfArrayOfComponentDetail")
    public JAXBElement<ArrayOfArrayOfComponentDetail> createArrayOfArrayOfComponentDetail(
        ArrayOfArrayOfComponentDetail value) {
        return new JAXBElement<ArrayOfArrayOfComponentDetail>(_ArrayOfArrayOfComponentDetail_QNAME,
            ArrayOfArrayOfComponentDetail.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfArrayOfConstraintRelation }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link ArrayOfArrayOfConstraintRelation }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/crm/2011/Contracts", name = "ArrayOfArrayOfConstraintRelation")
    public JAXBElement<ArrayOfArrayOfConstraintRelation> createArrayOfArrayOfConstraintRelation(
        ArrayOfArrayOfConstraintRelation value) {
        return new JAXBElement<ArrayOfArrayOfConstraintRelation>(_ArrayOfArrayOfConstraintRelation_QNAME,
            ArrayOfArrayOfConstraintRelation.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BulkOperationSource }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link BulkOperationSource }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/crm/2011/Contracts", name = "BulkOperationSource")
    public JAXBElement<BulkOperationSource> createBulkOperationSource(BulkOperationSource value) {
        return new JAXBElement<BulkOperationSource>(_BulkOperationSource_QNAME, BulkOperationSource.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfBulkOperationSource }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link ArrayOfBulkOperationSource }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/crm/2011/Contracts", name = "ArrayOfBulkOperationSource")
    public JAXBElement<ArrayOfBulkOperationSource> createArrayOfBulkOperationSource(ArrayOfBulkOperationSource value) {
        return new JAXBElement<ArrayOfBulkOperationSource>(_ArrayOfBulkOperationSource_QNAME,
            ArrayOfBulkOperationSource.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfArrayOfBulkOperationSource }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link ArrayOfArrayOfBulkOperationSource }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/crm/2011/Contracts", name = "ArrayOfArrayOfBulkOperationSource")
    public JAXBElement<ArrayOfArrayOfBulkOperationSource> createArrayOfArrayOfBulkOperationSource(
        ArrayOfArrayOfBulkOperationSource value) {
        return new JAXBElement<ArrayOfArrayOfBulkOperationSource>(_ArrayOfArrayOfBulkOperationSource_QNAME,
            ArrayOfArrayOfBulkOperationSource.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EntitySource }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link EntitySource }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/crm/2011/Contracts", name = "EntitySource")
    public JAXBElement<EntitySource> createEntitySource(EntitySource value) {
        return new JAXBElement<EntitySource>(_EntitySource_QNAME, EntitySource.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfEntitySource }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link ArrayOfEntitySource }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/crm/2011/Contracts", name = "ArrayOfEntitySource")
    public JAXBElement<ArrayOfEntitySource> createArrayOfEntitySource(ArrayOfEntitySource value) {
        return new JAXBElement<ArrayOfEntitySource>(_ArrayOfEntitySource_QNAME, ArrayOfEntitySource.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfArrayOfEntitySource }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link ArrayOfArrayOfEntitySource }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/crm/2011/Contracts", name = "ArrayOfArrayOfEntitySource")
    public JAXBElement<ArrayOfArrayOfEntitySource> createArrayOfArrayOfEntitySource(ArrayOfArrayOfEntitySource value) {
        return new JAXBElement<ArrayOfArrayOfEntitySource>(_ArrayOfArrayOfEntitySource_QNAME,
            ArrayOfArrayOfEntitySource.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TargetFieldType }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link TargetFieldType }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/crm/2011/Contracts", name = "TargetFieldType")
    public JAXBElement<TargetFieldType> createTargetFieldType(TargetFieldType value) {
        return new JAXBElement<TargetFieldType>(_TargetFieldType_QNAME, TargetFieldType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfTargetFieldType }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link ArrayOfTargetFieldType }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/crm/2011/Contracts", name = "ArrayOfTargetFieldType")
    public JAXBElement<ArrayOfTargetFieldType> createArrayOfTargetFieldType(ArrayOfTargetFieldType value) {
        return new JAXBElement<ArrayOfTargetFieldType>(_ArrayOfTargetFieldType_QNAME, ArrayOfTargetFieldType.class,
            null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfArrayOfTargetFieldType }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link ArrayOfArrayOfTargetFieldType }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/crm/2011/Contracts", name = "ArrayOfArrayOfTargetFieldType")
    public JAXBElement<ArrayOfArrayOfTargetFieldType> createArrayOfArrayOfTargetFieldType(
        ArrayOfArrayOfTargetFieldType value) {
        return new JAXBElement<ArrayOfArrayOfTargetFieldType>(_ArrayOfArrayOfTargetFieldType_QNAME,
            ArrayOfArrayOfTargetFieldType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PropagationOwnershipOptions }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link PropagationOwnershipOptions }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/crm/2011/Contracts", name = "PropagationOwnershipOptions")
    public JAXBElement<PropagationOwnershipOptions> createPropagationOwnershipOptions(
        PropagationOwnershipOptions value) {
        return new JAXBElement<PropagationOwnershipOptions>(_PropagationOwnershipOptions_QNAME,
            PropagationOwnershipOptions.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfPropagationOwnershipOptions }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link ArrayOfPropagationOwnershipOptions }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/crm/2011/Contracts", name = "ArrayOfPropagationOwnershipOptions")
    public JAXBElement<ArrayOfPropagationOwnershipOptions> createArrayOfPropagationOwnershipOptions(
        ArrayOfPropagationOwnershipOptions value) {
        return new JAXBElement<ArrayOfPropagationOwnershipOptions>(_ArrayOfPropagationOwnershipOptions_QNAME,
            ArrayOfPropagationOwnershipOptions.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfArrayOfPropagationOwnershipOptions }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link ArrayOfArrayOfPropagationOwnershipOptions }{@code
     * >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/crm/2011/Contracts", name = "ArrayOfArrayOfPropagationOwnershipOptions")
    public JAXBElement<ArrayOfArrayOfPropagationOwnershipOptions> createArrayOfArrayOfPropagationOwnershipOptions(
        ArrayOfArrayOfPropagationOwnershipOptions value) {
        return new JAXBElement<ArrayOfArrayOfPropagationOwnershipOptions>(
            _ArrayOfArrayOfPropagationOwnershipOptions_QNAME, ArrayOfArrayOfPropagationOwnershipOptions.class, null,
            value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RollupType }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link RollupType }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/crm/2011/Contracts", name = "RollupType")
    public JAXBElement<RollupType> createRollupType(RollupType value) {
        return new JAXBElement<RollupType>(_RollupType_QNAME, RollupType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfRollupType }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link ArrayOfRollupType }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/crm/2011/Contracts", name = "ArrayOfRollupType")
    public JAXBElement<ArrayOfRollupType> createArrayOfRollupType(ArrayOfRollupType value) {
        return new JAXBElement<ArrayOfRollupType>(_ArrayOfRollupType_QNAME, ArrayOfRollupType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfArrayOfRollupType }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link ArrayOfArrayOfRollupType }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/crm/2011/Contracts", name = "ArrayOfArrayOfRollupType")
    public JAXBElement<ArrayOfArrayOfRollupType> createArrayOfArrayOfRollupType(ArrayOfArrayOfRollupType value) {
        return new JAXBElement<ArrayOfArrayOfRollupType>(_ArrayOfArrayOfRollupType_QNAME,
            ArrayOfArrayOfRollupType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExportDynamicToExcelType }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link ExportDynamicToExcelType }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/crm/2011/Contracts", name = "ExportDynamicToExcelType")
    public JAXBElement<ExportDynamicToExcelType> createExportDynamicToExcelType(ExportDynamicToExcelType value) {
        return new JAXBElement<ExportDynamicToExcelType>(_ExportDynamicToExcelType_QNAME,
            ExportDynamicToExcelType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfExportDynamicToExcelType }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link ArrayOfExportDynamicToExcelType }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/crm/2011/Contracts", name = "ArrayOfExportDynamicToExcelType")
    public JAXBElement<ArrayOfExportDynamicToExcelType> createArrayOfExportDynamicToExcelType(
        ArrayOfExportDynamicToExcelType value) {
        return new JAXBElement<ArrayOfExportDynamicToExcelType>(_ArrayOfExportDynamicToExcelType_QNAME,
            ArrayOfExportDynamicToExcelType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfArrayOfExportDynamicToExcelType }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link ArrayOfArrayOfExportDynamicToExcelType }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/crm/2011/Contracts", name = "ArrayOfArrayOfExportDynamicToExcelType")
    public JAXBElement<ArrayOfArrayOfExportDynamicToExcelType> createArrayOfArrayOfExportDynamicToExcelType(
        ArrayOfArrayOfExportDynamicToExcelType value) {
        return new JAXBElement<ArrayOfArrayOfExportDynamicToExcelType>(_ArrayOfArrayOfExportDynamicToExcelType_QNAME,
            ArrayOfArrayOfExportDynamicToExcelType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ErrorInfo }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link ErrorInfo }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/crm/2011/Contracts", name = "ErrorInfo")
    public JAXBElement<ErrorInfo> createErrorInfo(ErrorInfo value) {
        return new JAXBElement<ErrorInfo>(_ErrorInfo_QNAME, ErrorInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfResourceInfo }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link ArrayOfResourceInfo }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/crm/2011/Contracts", name = "ArrayOfResourceInfo")
    public JAXBElement<ArrayOfResourceInfo> createArrayOfResourceInfo(ArrayOfResourceInfo value) {
        return new JAXBElement<ArrayOfResourceInfo>(_ArrayOfResourceInfo_QNAME, ArrayOfResourceInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ResourceInfo }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link ResourceInfo }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/crm/2011/Contracts", name = "ResourceInfo")
    public JAXBElement<ResourceInfo> createResourceInfo(ResourceInfo value) {
        return new JAXBElement<ResourceInfo>(_ResourceInfo_QNAME, ResourceInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfErrorInfo }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link ArrayOfErrorInfo }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/crm/2011/Contracts", name = "ArrayOfErrorInfo")
    public JAXBElement<ArrayOfErrorInfo> createArrayOfErrorInfo(ArrayOfErrorInfo value) {
        return new JAXBElement<ArrayOfErrorInfo>(_ArrayOfErrorInfo_QNAME, ArrayOfErrorInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfArrayOfErrorInfo }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link ArrayOfArrayOfErrorInfo }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/crm/2011/Contracts", name = "ArrayOfArrayOfErrorInfo")
    public JAXBElement<ArrayOfArrayOfErrorInfo> createArrayOfArrayOfErrorInfo(ArrayOfArrayOfErrorInfo value) {
        return new JAXBElement<ArrayOfArrayOfErrorInfo>(_ArrayOfArrayOfErrorInfo_QNAME, ArrayOfArrayOfErrorInfo.class,
            null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InputArgumentCollection }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link InputArgumentCollection }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/crm/2011/Contracts", name = "InputArgumentCollection")
    public JAXBElement<InputArgumentCollection> createInputArgumentCollection(InputArgumentCollection value) {
        return new JAXBElement<InputArgumentCollection>(_InputArgumentCollection_QNAME, InputArgumentCollection.class,
            null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfInputArgumentCollection }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link ArrayOfInputArgumentCollection }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/crm/2011/Contracts", name = "ArrayOfInputArgumentCollection")
    public JAXBElement<ArrayOfInputArgumentCollection> createArrayOfInputArgumentCollection(
        ArrayOfInputArgumentCollection value) {
        return new JAXBElement<ArrayOfInputArgumentCollection>(_ArrayOfInputArgumentCollection_QNAME,
            ArrayOfInputArgumentCollection.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfArrayOfInputArgumentCollection }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link ArrayOfArrayOfInputArgumentCollection }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/crm/2011/Contracts", name = "ArrayOfArrayOfInputArgumentCollection")
    public JAXBElement<ArrayOfArrayOfInputArgumentCollection> createArrayOfArrayOfInputArgumentCollection(
        ArrayOfArrayOfInputArgumentCollection value) {
        return new JAXBElement<ArrayOfArrayOfInputArgumentCollection>(_ArrayOfArrayOfInputArgumentCollection_QNAME,
            ArrayOfArrayOfInputArgumentCollection.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BusinessNotification }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link BusinessNotification }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/crm/2011/Contracts", name = "BusinessNotification")
    public JAXBElement<BusinessNotification> createBusinessNotification(BusinessNotification value) {
        return new JAXBElement<BusinessNotification>(_BusinessNotification_QNAME, BusinessNotification.class, null,
            value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfBusinessNotification }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link ArrayOfBusinessNotification }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/crm/2011/Contracts", name = "ArrayOfBusinessNotification")
    public JAXBElement<ArrayOfBusinessNotification> createArrayOfBusinessNotification(
        ArrayOfBusinessNotification value) {
        return new JAXBElement<ArrayOfBusinessNotification>(_ArrayOfBusinessNotification_QNAME,
            ArrayOfBusinessNotification.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfArrayOfBusinessNotification }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link ArrayOfArrayOfBusinessNotification }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/crm/2011/Contracts", name = "ArrayOfArrayOfBusinessNotification")
    public JAXBElement<ArrayOfArrayOfBusinessNotification> createArrayOfArrayOfBusinessNotification(
        ArrayOfArrayOfBusinessNotification value) {
        return new JAXBElement<ArrayOfArrayOfBusinessNotification>(_ArrayOfArrayOfBusinessNotification_QNAME,
            ArrayOfArrayOfBusinessNotification.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MissingComponent }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link MissingComponent }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/crm/2011/Contracts", name = "MissingComponent")
    public JAXBElement<MissingComponent> createMissingComponent(MissingComponent value) {
        return new JAXBElement<MissingComponent>(_MissingComponent_QNAME, MissingComponent.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfMissingComponent }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link ArrayOfMissingComponent }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/crm/2011/Contracts", name = "ArrayOfMissingComponent")
    public JAXBElement<ArrayOfMissingComponent> createArrayOfMissingComponent(ArrayOfMissingComponent value) {
        return new JAXBElement<ArrayOfMissingComponent>(_ArrayOfMissingComponent_QNAME, ArrayOfMissingComponent.class,
            null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfArrayOfMissingComponent }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link ArrayOfArrayOfMissingComponent }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/crm/2011/Contracts", name = "ArrayOfArrayOfMissingComponent")
    public JAXBElement<ArrayOfArrayOfMissingComponent> createArrayOfArrayOfMissingComponent(
        ArrayOfArrayOfMissingComponent value) {
        return new JAXBElement<ArrayOfArrayOfMissingComponent>(_ArrayOfArrayOfMissingComponent_QNAME,
            ArrayOfArrayOfMissingComponent.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfArrayOfObjectiveRelation }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link ArrayOfArrayOfObjectiveRelation }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/crm/2011/Contracts", name = "ArrayOfArrayOfObjectiveRelation")
    public JAXBElement<ArrayOfArrayOfObjectiveRelation> createArrayOfArrayOfObjectiveRelation(
        ArrayOfArrayOfObjectiveRelation value) {
        return new JAXBElement<ArrayOfArrayOfObjectiveRelation>(_ArrayOfArrayOfObjectiveRelation_QNAME,
            ArrayOfArrayOfObjectiveRelation.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OrganizationResources }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link OrganizationResources }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/crm/2011/Contracts", name = "OrganizationResources")
    public JAXBElement<OrganizationResources> createOrganizationResources(OrganizationResources value) {
        return new JAXBElement<OrganizationResources>(_OrganizationResources_QNAME, OrganizationResources.class, null,
            value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfOrganizationResources }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link ArrayOfOrganizationResources }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/crm/2011/Contracts", name = "ArrayOfOrganizationResources")
    public JAXBElement<ArrayOfOrganizationResources> createArrayOfOrganizationResources(
        ArrayOfOrganizationResources value) {
        return new JAXBElement<ArrayOfOrganizationResources>(_ArrayOfOrganizationResources_QNAME,
            ArrayOfOrganizationResources.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfArrayOfOrganizationResources }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link ArrayOfArrayOfOrganizationResources }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/crm/2011/Contracts", name = "ArrayOfArrayOfOrganizationResources")
    public JAXBElement<ArrayOfArrayOfOrganizationResources> createArrayOfArrayOfOrganizationResources(
        ArrayOfArrayOfOrganizationResources value) {
        return new JAXBElement<ArrayOfArrayOfOrganizationResources>(_ArrayOfArrayOfOrganizationResources_QNAME,
            ArrayOfArrayOfOrganizationResources.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PrincipalAccess }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link PrincipalAccess }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/crm/2011/Contracts", name = "PrincipalAccess")
    public JAXBElement<PrincipalAccess> createPrincipalAccess(PrincipalAccess value) {
        return new JAXBElement<PrincipalAccess>(_PrincipalAccess_QNAME, PrincipalAccess.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfPrincipalAccess }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link ArrayOfPrincipalAccess }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/crm/2011/Contracts", name = "ArrayOfPrincipalAccess")
    public JAXBElement<ArrayOfPrincipalAccess> createArrayOfPrincipalAccess(ArrayOfPrincipalAccess value) {
        return new JAXBElement<ArrayOfPrincipalAccess>(_ArrayOfPrincipalAccess_QNAME, ArrayOfPrincipalAccess.class,
            null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfArrayOfPrincipalAccess }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link ArrayOfArrayOfPrincipalAccess }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/crm/2011/Contracts", name = "ArrayOfArrayOfPrincipalAccess")
    public JAXBElement<ArrayOfArrayOfPrincipalAccess> createArrayOfArrayOfPrincipalAccess(
        ArrayOfArrayOfPrincipalAccess value) {
        return new JAXBElement<ArrayOfArrayOfPrincipalAccess>(_ArrayOfArrayOfPrincipalAccess_QNAME,
            ArrayOfArrayOfPrincipalAccess.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfAccessRights }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link ArrayOfAccessRights }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/crm/2011/Contracts", name = "ArrayOfAccessRights")
    public JAXBElement<ArrayOfAccessRights> createArrayOfAccessRights(ArrayOfAccessRights value) {
        return new JAXBElement<ArrayOfAccessRights>(_ArrayOfAccessRights_QNAME, ArrayOfAccessRights.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfArrayOfAccessRights }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link ArrayOfArrayOfAccessRights }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/crm/2011/Contracts", name = "ArrayOfArrayOfAccessRights")
    public JAXBElement<ArrayOfArrayOfAccessRights> createArrayOfArrayOfAccessRights(ArrayOfArrayOfAccessRights value) {
        return new JAXBElement<ArrayOfArrayOfAccessRights>(_ArrayOfArrayOfAccessRights_QNAME,
            ArrayOfArrayOfAccessRights.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfArrayOfProposalParty }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link ArrayOfArrayOfProposalParty }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/crm/2011/Contracts", name = "ArrayOfArrayOfProposalParty")
    public JAXBElement<ArrayOfArrayOfProposalParty> createArrayOfArrayOfProposalParty(
        ArrayOfArrayOfProposalParty value) {
        return new JAXBElement<ArrayOfArrayOfProposalParty>(_ArrayOfArrayOfProposalParty_QNAME,
            ArrayOfArrayOfProposalParty.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfRelationshipAuditDetail }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link ArrayOfRelationshipAuditDetail }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/crm/2011/Contracts", name = "ArrayOfRelationshipAuditDetail")
    public JAXBElement<ArrayOfRelationshipAuditDetail> createArrayOfRelationshipAuditDetail(
        ArrayOfRelationshipAuditDetail value) {
        return new JAXBElement<ArrayOfRelationshipAuditDetail>(_ArrayOfRelationshipAuditDetail_QNAME,
            ArrayOfRelationshipAuditDetail.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfArrayOfRelationshipAuditDetail }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link ArrayOfArrayOfRelationshipAuditDetail }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/crm/2011/Contracts", name = "ArrayOfArrayOfRelationshipAuditDetail")
    public JAXBElement<ArrayOfArrayOfRelationshipAuditDetail> createArrayOfArrayOfRelationshipAuditDetail(
        ArrayOfArrayOfRelationshipAuditDetail value) {
        return new JAXBElement<ArrayOfArrayOfRelationshipAuditDetail>(_ArrayOfArrayOfRelationshipAuditDetail_QNAME,
            ArrayOfArrayOfRelationshipAuditDetail.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfArrayOfRequiredResource }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link ArrayOfArrayOfRequiredResource }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/crm/2011/Contracts", name = "ArrayOfArrayOfRequiredResource")
    public JAXBElement<ArrayOfArrayOfRequiredResource> createArrayOfArrayOfRequiredResource(
        ArrayOfArrayOfRequiredResource value) {
        return new JAXBElement<ArrayOfArrayOfRequiredResource>(_ArrayOfArrayOfRequiredResource_QNAME,
            ArrayOfArrayOfRequiredResource.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfArrayOfResourceInfo }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link ArrayOfArrayOfResourceInfo }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/crm/2011/Contracts", name = "ArrayOfArrayOfResourceInfo")
    public JAXBElement<ArrayOfArrayOfResourceInfo> createArrayOfArrayOfResourceInfo(ArrayOfArrayOfResourceInfo value) {
        return new JAXBElement<ArrayOfArrayOfResourceInfo>(_ArrayOfArrayOfResourceInfo_QNAME,
            ArrayOfArrayOfResourceInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link List }{@code <}{@link String }{@code >}{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link List }{@code <}{@link String }{@code >}{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/crm/2011/Contracts", name = "RibbonLocationFilters")
    public JAXBElement<List<String>> createRibbonLocationFilters(List<String> value) {
        return new JAXBElement<List<String>>(_RibbonLocationFilters_QNAME, ((Class) List.class), null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfRibbonLocationFilters }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link ArrayOfRibbonLocationFilters }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/crm/2011/Contracts", name = "ArrayOfRibbonLocationFilters")
    public JAXBElement<ArrayOfRibbonLocationFilters> createArrayOfRibbonLocationFilters(
        ArrayOfRibbonLocationFilters value) {
        return new JAXBElement<ArrayOfRibbonLocationFilters>(_ArrayOfRibbonLocationFilters_QNAME,
            ArrayOfRibbonLocationFilters.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfArrayOfRibbonLocationFilters }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link ArrayOfArrayOfRibbonLocationFilters }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/crm/2011/Contracts", name = "ArrayOfArrayOfRibbonLocationFilters")
    public JAXBElement<ArrayOfArrayOfRibbonLocationFilters> createArrayOfArrayOfRibbonLocationFilters(
        ArrayOfArrayOfRibbonLocationFilters value) {
        return new JAXBElement<ArrayOfArrayOfRibbonLocationFilters>(_ArrayOfArrayOfRibbonLocationFilters_QNAME,
            ArrayOfArrayOfRibbonLocationFilters.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PrivilegeDepth }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link PrivilegeDepth }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/crm/2011/Contracts", name = "PrivilegeDepth")
    public JAXBElement<PrivilegeDepth> createPrivilegeDepth(PrivilegeDepth value) {
        return new JAXBElement<PrivilegeDepth>(_PrivilegeDepth_QNAME, PrivilegeDepth.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfPrivilegeDepth }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link ArrayOfPrivilegeDepth }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/crm/2011/Contracts", name = "ArrayOfPrivilegeDepth")
    public JAXBElement<ArrayOfPrivilegeDepth> createArrayOfPrivilegeDepth(ArrayOfPrivilegeDepth value) {
        return new JAXBElement<ArrayOfPrivilegeDepth>(_ArrayOfPrivilegeDepth_QNAME, ArrayOfPrivilegeDepth.class, null,
            value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfArrayOfPrivilegeDepth }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link ArrayOfArrayOfPrivilegeDepth }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/crm/2011/Contracts", name = "ArrayOfArrayOfPrivilegeDepth")
    public JAXBElement<ArrayOfArrayOfPrivilegeDepth> createArrayOfArrayOfPrivilegeDepth(
        ArrayOfArrayOfPrivilegeDepth value) {
        return new JAXBElement<ArrayOfArrayOfPrivilegeDepth>(_ArrayOfArrayOfPrivilegeDepth_QNAME,
            ArrayOfArrayOfPrivilegeDepth.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RolePrivilege }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link RolePrivilege }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/crm/2011/Contracts", name = "RolePrivilege")
    public JAXBElement<RolePrivilege> createRolePrivilege(RolePrivilege value) {
        return new JAXBElement<RolePrivilege>(_RolePrivilege_QNAME, RolePrivilege.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfRolePrivilege }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link ArrayOfRolePrivilege }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/crm/2011/Contracts", name = "ArrayOfRolePrivilege")
    public JAXBElement<ArrayOfRolePrivilege> createArrayOfRolePrivilege(ArrayOfRolePrivilege value) {
        return new JAXBElement<ArrayOfRolePrivilege>(_ArrayOfRolePrivilege_QNAME, ArrayOfRolePrivilege.class, null,
            value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfArrayOfRolePrivilege }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link ArrayOfArrayOfRolePrivilege }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/crm/2011/Contracts", name = "ArrayOfArrayOfRolePrivilege")
    public JAXBElement<ArrayOfArrayOfRolePrivilege> createArrayOfArrayOfRolePrivilege(
        ArrayOfArrayOfRolePrivilege value) {
        return new JAXBElement<ArrayOfArrayOfRolePrivilege>(_ArrayOfArrayOfRolePrivilege_QNAME,
            ArrayOfArrayOfRolePrivilege.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchResults }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link SearchResults }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/crm/2011/Contracts", name = "SearchResults")
    public JAXBElement<SearchResults> createSearchResults(SearchResults value) {
        return new JAXBElement<SearchResults>(_SearchResults_QNAME, SearchResults.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TraceInfo }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link TraceInfo }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/crm/2011/Contracts", name = "TraceInfo")
    public JAXBElement<TraceInfo> createTraceInfo(TraceInfo value) {
        return new JAXBElement<TraceInfo>(_TraceInfo_QNAME, TraceInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfSearchResults }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link ArrayOfSearchResults }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/crm/2011/Contracts", name = "ArrayOfSearchResults")
    public JAXBElement<ArrayOfSearchResults> createArrayOfSearchResults(ArrayOfSearchResults value) {
        return new JAXBElement<ArrayOfSearchResults>(_ArrayOfSearchResults_QNAME, ArrayOfSearchResults.class, null,
            value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfArrayOfSearchResults }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link ArrayOfArrayOfSearchResults }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/crm/2011/Contracts", name = "ArrayOfArrayOfSearchResults")
    public JAXBElement<ArrayOfArrayOfSearchResults> createArrayOfArrayOfSearchResults(
        ArrayOfArrayOfSearchResults value) {
        return new JAXBElement<ArrayOfArrayOfSearchResults>(_ArrayOfArrayOfSearchResults_QNAME,
            ArrayOfArrayOfSearchResults.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfShareAuditDetail }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link ArrayOfShareAuditDetail }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/crm/2011/Contracts", name = "ArrayOfShareAuditDetail")
    public JAXBElement<ArrayOfShareAuditDetail> createArrayOfShareAuditDetail(ArrayOfShareAuditDetail value) {
        return new JAXBElement<ArrayOfShareAuditDetail>(_ArrayOfShareAuditDetail_QNAME, ArrayOfShareAuditDetail.class,
            null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfArrayOfShareAuditDetail }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link ArrayOfArrayOfShareAuditDetail }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/crm/2011/Contracts", name = "ArrayOfArrayOfShareAuditDetail")
    public JAXBElement<ArrayOfArrayOfShareAuditDetail> createArrayOfArrayOfShareAuditDetail(
        ArrayOfArrayOfShareAuditDetail value) {
        return new JAXBElement<ArrayOfArrayOfShareAuditDetail>(_ArrayOfArrayOfShareAuditDetail_QNAME,
            ArrayOfArrayOfShareAuditDetail.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RolePrivilegeAuditDetail }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link RolePrivilegeAuditDetail }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/crm/2011/Contracts", name = "RolePrivilegeAuditDetail")
    public JAXBElement<RolePrivilegeAuditDetail> createRolePrivilegeAuditDetail(RolePrivilegeAuditDetail value) {
        return new JAXBElement<RolePrivilegeAuditDetail>(_RolePrivilegeAuditDetail_QNAME,
            RolePrivilegeAuditDetail.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfRolePrivilegeAuditDetail }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link ArrayOfRolePrivilegeAuditDetail }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/crm/2011/Contracts", name = "ArrayOfRolePrivilegeAuditDetail")
    public JAXBElement<ArrayOfRolePrivilegeAuditDetail> createArrayOfRolePrivilegeAuditDetail(
        ArrayOfRolePrivilegeAuditDetail value) {
        return new JAXBElement<ArrayOfRolePrivilegeAuditDetail>(_ArrayOfRolePrivilegeAuditDetail_QNAME,
            ArrayOfRolePrivilegeAuditDetail.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfArrayOfRolePrivilegeAuditDetail }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link ArrayOfArrayOfRolePrivilegeAuditDetail }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/crm/2011/Contracts", name = "ArrayOfArrayOfRolePrivilegeAuditDetail")
    public JAXBElement<ArrayOfArrayOfRolePrivilegeAuditDetail> createArrayOfArrayOfRolePrivilegeAuditDetail(
        ArrayOfArrayOfRolePrivilegeAuditDetail value) {
        return new JAXBElement<ArrayOfArrayOfRolePrivilegeAuditDetail>(_ArrayOfArrayOfRolePrivilegeAuditDetail_QNAME,
            ArrayOfArrayOfRolePrivilegeAuditDetail.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TimeInfo }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link TimeInfo }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/crm/2011/Contracts", name = "TimeInfo")
    public JAXBElement<TimeInfo> createTimeInfo(TimeInfo value) {
        return new JAXBElement<TimeInfo>(_TimeInfo_QNAME, TimeInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SubCode }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link SubCode }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/crm/2011/Contracts", name = "SubCode")
    public JAXBElement<SubCode> createSubCode(SubCode value) {
        return new JAXBElement<SubCode>(_SubCode_QNAME, SubCode.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TimeCode }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link TimeCode }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/crm/2011/Contracts", name = "TimeCode")
    public JAXBElement<TimeCode> createTimeCode(TimeCode value) {
        return new JAXBElement<TimeCode>(_TimeCode_QNAME, TimeCode.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfTimeInfo }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link ArrayOfTimeInfo }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/crm/2011/Contracts", name = "ArrayOfTimeInfo")
    public JAXBElement<ArrayOfTimeInfo> createArrayOfTimeInfo(ArrayOfTimeInfo value) {
        return new JAXBElement<ArrayOfTimeInfo>(_ArrayOfTimeInfo_QNAME, ArrayOfTimeInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfArrayOfTimeInfo }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link ArrayOfArrayOfTimeInfo }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/crm/2011/Contracts", name = "ArrayOfArrayOfTimeInfo")
    public JAXBElement<ArrayOfArrayOfTimeInfo> createArrayOfArrayOfTimeInfo(ArrayOfArrayOfTimeInfo value) {
        return new JAXBElement<ArrayOfArrayOfTimeInfo>(_ArrayOfArrayOfTimeInfo_QNAME, ArrayOfArrayOfTimeInfo.class,
            null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfTimeCode }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link ArrayOfTimeCode }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/crm/2011/Contracts", name = "ArrayOfTimeCode")
    public JAXBElement<ArrayOfTimeCode> createArrayOfTimeCode(ArrayOfTimeCode value) {
        return new JAXBElement<ArrayOfTimeCode>(_ArrayOfTimeCode_QNAME, ArrayOfTimeCode.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfArrayOfTimeCode }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link ArrayOfArrayOfTimeCode }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/crm/2011/Contracts", name = "ArrayOfArrayOfTimeCode")
    public JAXBElement<ArrayOfArrayOfTimeCode> createArrayOfArrayOfTimeCode(ArrayOfArrayOfTimeCode value) {
        return new JAXBElement<ArrayOfArrayOfTimeCode>(_ArrayOfArrayOfTimeCode_QNAME, ArrayOfArrayOfTimeCode.class,
            null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfSubCode }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link ArrayOfSubCode }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/crm/2011/Contracts", name = "ArrayOfSubCode")
    public JAXBElement<ArrayOfSubCode> createArrayOfSubCode(ArrayOfSubCode value) {
        return new JAXBElement<ArrayOfSubCode>(_ArrayOfSubCode_QNAME, ArrayOfSubCode.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfArrayOfSubCode }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link ArrayOfArrayOfSubCode }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/crm/2011/Contracts", name = "ArrayOfArrayOfSubCode")
    public JAXBElement<ArrayOfArrayOfSubCode> createArrayOfArrayOfSubCode(ArrayOfArrayOfSubCode value) {
        return new JAXBElement<ArrayOfArrayOfSubCode>(_ArrayOfArrayOfSubCode_QNAME, ArrayOfArrayOfSubCode.class, null,
            value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfTraceInfo }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link ArrayOfTraceInfo }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/crm/2011/Contracts", name = "ArrayOfTraceInfo")
    public JAXBElement<ArrayOfTraceInfo> createArrayOfTraceInfo(ArrayOfTraceInfo value) {
        return new JAXBElement<ArrayOfTraceInfo>(_ArrayOfTraceInfo_QNAME, ArrayOfTraceInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfArrayOfTraceInfo }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link ArrayOfArrayOfTraceInfo }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/crm/2011/Contracts", name = "ArrayOfArrayOfTraceInfo")
    public JAXBElement<ArrayOfArrayOfTraceInfo> createArrayOfArrayOfTraceInfo(ArrayOfArrayOfTraceInfo value) {
        return new JAXBElement<ArrayOfArrayOfTraceInfo>(_ArrayOfArrayOfTraceInfo_QNAME, ArrayOfArrayOfTraceInfo.class,
            null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UserAccessAuditDetail }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link UserAccessAuditDetail }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/crm/2011/Contracts", name = "UserAccessAuditDetail")
    public JAXBElement<UserAccessAuditDetail> createUserAccessAuditDetail(UserAccessAuditDetail value) {
        return new JAXBElement<UserAccessAuditDetail>(_UserAccessAuditDetail_QNAME, UserAccessAuditDetail.class, null,
            value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfUserAccessAuditDetail }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link ArrayOfUserAccessAuditDetail }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/crm/2011/Contracts", name = "ArrayOfUserAccessAuditDetail")
    public JAXBElement<ArrayOfUserAccessAuditDetail> createArrayOfUserAccessAuditDetail(
        ArrayOfUserAccessAuditDetail value) {
        return new JAXBElement<ArrayOfUserAccessAuditDetail>(_ArrayOfUserAccessAuditDetail_QNAME,
            ArrayOfUserAccessAuditDetail.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfArrayOfUserAccessAuditDetail }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link ArrayOfArrayOfUserAccessAuditDetail }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/crm/2011/Contracts", name = "ArrayOfArrayOfUserAccessAuditDetail")
    public JAXBElement<ArrayOfArrayOfUserAccessAuditDetail> createArrayOfArrayOfUserAccessAuditDetail(
        ArrayOfArrayOfUserAccessAuditDetail value) {
        return new JAXBElement<ArrayOfArrayOfUserAccessAuditDetail>(_ArrayOfArrayOfUserAccessAuditDetail_QNAME,
            ArrayOfArrayOfUserAccessAuditDetail.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ValidationResult }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link ValidationResult }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/crm/2011/Contracts", name = "ValidationResult")
    public JAXBElement<ValidationResult> createValidationResult(ValidationResult value) {
        return new JAXBElement<ValidationResult>(_ValidationResult_QNAME, ValidationResult.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfValidationResult }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link ArrayOfValidationResult }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/crm/2011/Contracts", name = "ArrayOfValidationResult")
    public JAXBElement<ArrayOfValidationResult> createArrayOfValidationResult(ArrayOfValidationResult value) {
        return new JAXBElement<ArrayOfValidationResult>(_ArrayOfValidationResult_QNAME, ArrayOfValidationResult.class,
            null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfArrayOfValidationResult }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link ArrayOfArrayOfValidationResult }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/crm/2011/Contracts", name = "ArrayOfArrayOfValidationResult")
    public JAXBElement<ArrayOfArrayOfValidationResult> createArrayOfArrayOfValidationResult(
        ArrayOfArrayOfValidationResult value) {
        return new JAXBElement<ArrayOfArrayOfValidationResult>(_ArrayOfArrayOfValidationResult_QNAME,
            ArrayOfArrayOfValidationResult.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CacheItem }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link CacheItem }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/crm/2011/Contracts", name = "CacheItem")
    public JAXBElement<CacheItem> createCacheItem(CacheItem value) {
        return new JAXBElement<CacheItem>(_CacheItem_QNAME, CacheItem.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfCacheItem }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link ArrayOfCacheItem }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/crm/2011/Contracts", name = "ArrayOfCacheItem")
    public JAXBElement<ArrayOfCacheItem> createArrayOfCacheItem(ArrayOfCacheItem value) {
        return new JAXBElement<ArrayOfCacheItem>(_ArrayOfCacheItem_QNAME, ArrayOfCacheItem.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfArrayOfCacheItem }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link ArrayOfArrayOfCacheItem }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/crm/2011/Contracts", name = "ArrayOfArrayOfCacheItem")
    public JAXBElement<ArrayOfArrayOfCacheItem> createArrayOfArrayOfCacheItem(ArrayOfArrayOfCacheItem value) {
        return new JAXBElement<ArrayOfArrayOfCacheItem>(_ArrayOfArrayOfCacheItem_QNAME, ArrayOfArrayOfCacheItem.class,
            null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FaultType }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link FaultType }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/crm/2011/Contracts", name = "FaultType")
    public JAXBElement<FaultType> createFaultType(FaultType value) {
        return new JAXBElement<FaultType>(_FaultType_QNAME, FaultType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfFaultType }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link ArrayOfFaultType }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/crm/2011/Contracts", name = "ArrayOfFaultType")
    public JAXBElement<ArrayOfFaultType> createArrayOfFaultType(ArrayOfFaultType value) {
        return new JAXBElement<ArrayOfFaultType>(_ArrayOfFaultType_QNAME, ArrayOfFaultType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfArrayOfFaultType }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link ArrayOfArrayOfFaultType }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/crm/2011/Contracts", name = "ArrayOfArrayOfFaultType")
    public JAXBElement<ArrayOfArrayOfFaultType> createArrayOfArrayOfFaultType(ArrayOfArrayOfFaultType value) {
        return new JAXBElement<ArrayOfArrayOfFaultType>(_ArrayOfArrayOfFaultType_QNAME, ArrayOfArrayOfFaultType.class,
            null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QueryByEntityNameDictionary }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link QueryByEntityNameDictionary }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/crm/2011/Contracts", name = "QueryByEntityNameDictionary")
    public JAXBElement<QueryByEntityNameDictionary> createQueryByEntityNameDictionary(
        QueryByEntityNameDictionary value) {
        return new JAXBElement<QueryByEntityNameDictionary>(_QueryByEntityNameDictionary_QNAME,
            QueryByEntityNameDictionary.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfQueryByEntityNameDictionary }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link ArrayOfQueryByEntityNameDictionary }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/crm/2011/Contracts", name = "ArrayOfQueryByEntityNameDictionary")
    public JAXBElement<ArrayOfQueryByEntityNameDictionary> createArrayOfQueryByEntityNameDictionary(
        ArrayOfQueryByEntityNameDictionary value) {
        return new JAXBElement<ArrayOfQueryByEntityNameDictionary>(_ArrayOfQueryByEntityNameDictionary_QNAME,
            ArrayOfQueryByEntityNameDictionary.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfArrayOfQueryByEntityNameDictionary }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link ArrayOfArrayOfQueryByEntityNameDictionary }{@code
     * >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/crm/2011/Contracts", name = "ArrayOfArrayOfQueryByEntityNameDictionary")
    public JAXBElement<ArrayOfArrayOfQueryByEntityNameDictionary> createArrayOfArrayOfQueryByEntityNameDictionary(
        ArrayOfArrayOfQueryByEntityNameDictionary value) {
        return new JAXBElement<ArrayOfArrayOfQueryByEntityNameDictionary>(
            _ArrayOfArrayOfQueryByEntityNameDictionary_QNAME, ArrayOfArrayOfQueryByEntityNameDictionary.class, null,
            value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ResetSyncStateInfo }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link ResetSyncStateInfo }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/crm/2011/Contracts", name = "ResetSyncStateInfo")
    public JAXBElement<ResetSyncStateInfo> createResetSyncStateInfo(ResetSyncStateInfo value) {
        return new JAXBElement<ResetSyncStateInfo>(_ResetSyncStateInfo_QNAME, ResetSyncStateInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfResetSyncStateInfo }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link ArrayOfResetSyncStateInfo }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/crm/2011/Contracts", name = "ArrayOfResetSyncStateInfo")
    public JAXBElement<ArrayOfResetSyncStateInfo> createArrayOfResetSyncStateInfo(ArrayOfResetSyncStateInfo value) {
        return new JAXBElement<ArrayOfResetSyncStateInfo>(_ArrayOfResetSyncStateInfo_QNAME,
            ArrayOfResetSyncStateInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfArrayOfResetSyncStateInfo }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link ArrayOfArrayOfResetSyncStateInfo }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/crm/2011/Contracts", name = "ArrayOfArrayOfResetSyncStateInfo")
    public JAXBElement<ArrayOfArrayOfResetSyncStateInfo> createArrayOfArrayOfResetSyncStateInfo(
        ArrayOfArrayOfResetSyncStateInfo value) {
        return new JAXBElement<ArrayOfArrayOfResetSyncStateInfo>(_ArrayOfArrayOfResetSyncStateInfo_QNAME,
            ArrayOfArrayOfResetSyncStateInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SdkMessageProcessingStepImageRegistration }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link SdkMessageProcessingStepImageRegistration }{@code
     * >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/crm/2011/Contracts", name = "SdkMessageProcessingStepImageRegistration")
    public JAXBElement<SdkMessageProcessingStepImageRegistration> createSdkMessageProcessingStepImageRegistration(
        SdkMessageProcessingStepImageRegistration value) {
        return new JAXBElement<SdkMessageProcessingStepImageRegistration>(
            _SdkMessageProcessingStepImageRegistration_QNAME, SdkMessageProcessingStepImageRegistration.class, null,
            value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfSdkMessageProcessingStepImageRegistration }{@code
     * >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link ArrayOfSdkMessageProcessingStepImageRegistration
     * }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/crm/2011/Contracts", name = "ArrayOfSdkMessageProcessingStepImageRegistration")
    public JAXBElement<ArrayOfSdkMessageProcessingStepImageRegistration> createArrayOfSdkMessageProcessingStepImageRegistration(
        ArrayOfSdkMessageProcessingStepImageRegistration value) {
        return new JAXBElement<ArrayOfSdkMessageProcessingStepImageRegistration>(
            _ArrayOfSdkMessageProcessingStepImageRegistration_QNAME,
            ArrayOfSdkMessageProcessingStepImageRegistration.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfArrayOfSdkMessageProcessingStepImageRegistration
     * }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link ArrayOfArrayOfSdkMessageProcessingStepImageRegistration
     * }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/crm/2011/Contracts", name = "ArrayOfArrayOfSdkMessageProcessingStepImageRegistration")
    public JAXBElement<ArrayOfArrayOfSdkMessageProcessingStepImageRegistration> createArrayOfArrayOfSdkMessageProcessingStepImageRegistration(
        ArrayOfArrayOfSdkMessageProcessingStepImageRegistration value) {
        return new JAXBElement<ArrayOfArrayOfSdkMessageProcessingStepImageRegistration>(
            _ArrayOfArrayOfSdkMessageProcessingStepImageRegistration_QNAME,
            ArrayOfArrayOfSdkMessageProcessingStepImageRegistration.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SdkMessageProcessingStepRegistration }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link SdkMessageProcessingStepRegistration }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/crm/2011/Contracts", name = "SdkMessageProcessingStepRegistration")
    public JAXBElement<SdkMessageProcessingStepRegistration> createSdkMessageProcessingStepRegistration(
        SdkMessageProcessingStepRegistration value) {
        return new JAXBElement<SdkMessageProcessingStepRegistration>(_SdkMessageProcessingStepRegistration_QNAME,
            SdkMessageProcessingStepRegistration.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfSdkMessageProcessingStepRegistration }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link ArrayOfSdkMessageProcessingStepRegistration }{@code
     * >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/crm/2011/Contracts", name = "ArrayOfSdkMessageProcessingStepRegistration")
    public JAXBElement<ArrayOfSdkMessageProcessingStepRegistration> createArrayOfSdkMessageProcessingStepRegistration(
        ArrayOfSdkMessageProcessingStepRegistration value) {
        return new JAXBElement<ArrayOfSdkMessageProcessingStepRegistration>(
            _ArrayOfSdkMessageProcessingStepRegistration_QNAME, ArrayOfSdkMessageProcessingStepRegistration.class, null,
            value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfArrayOfSdkMessageProcessingStepRegistration
     * }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link ArrayOfArrayOfSdkMessageProcessingStepRegistration
     * }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/crm/2011/Contracts", name = "ArrayOfArrayOfSdkMessageProcessingStepRegistration")
    public JAXBElement<ArrayOfArrayOfSdkMessageProcessingStepRegistration> createArrayOfArrayOfSdkMessageProcessingStepRegistration(
        ArrayOfArrayOfSdkMessageProcessingStepRegistration value) {
        return new JAXBElement<ArrayOfArrayOfSdkMessageProcessingStepRegistration>(
            _ArrayOfArrayOfSdkMessageProcessingStepRegistration_QNAME,
            ArrayOfArrayOfSdkMessageProcessingStepRegistration.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SyncAction }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link SyncAction }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/crm/2011/Contracts", name = "SyncAction")
    public JAXBElement<SyncAction> createSyncAction(SyncAction value) {
        return new JAXBElement<SyncAction>(_SyncAction_QNAME, SyncAction.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfSyncAction }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link ArrayOfSyncAction }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/crm/2011/Contracts", name = "ArrayOfSyncAction")
    public JAXBElement<ArrayOfSyncAction> createArrayOfSyncAction(ArrayOfSyncAction value) {
        return new JAXBElement<ArrayOfSyncAction>(_ArrayOfSyncAction_QNAME, ArrayOfSyncAction.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfArrayOfSyncAction }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link ArrayOfArrayOfSyncAction }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/crm/2011/Contracts", name = "ArrayOfArrayOfSyncAction")
    public JAXBElement<ArrayOfArrayOfSyncAction> createArrayOfArrayOfSyncAction(ArrayOfArrayOfSyncAction value) {
        return new JAXBElement<ArrayOfArrayOfSyncAction>(_ArrayOfArrayOfSyncAction_QNAME,
            ArrayOfArrayOfSyncAction.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfBusinessNotificationParameter }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link ArrayOfBusinessNotificationParameter }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Microsoft.Crm.Sdk.Messages", name = "ArrayOfBusinessNotificationParameter")
    public JAXBElement<ArrayOfBusinessNotificationParameter> createArrayOfBusinessNotificationParameter(
        ArrayOfBusinessNotificationParameter value) {
        return new JAXBElement<ArrayOfBusinessNotificationParameter>(_ArrayOfBusinessNotificationParameter_QNAME,
            ArrayOfBusinessNotificationParameter.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BusinessNotificationParameter }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link BusinessNotificationParameter }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Microsoft.Crm.Sdk.Messages", name = "BusinessNotificationParameter")
    public JAXBElement<BusinessNotificationParameter> createBusinessNotificationParameter(
        BusinessNotificationParameter value) {
        return new JAXBElement<BusinessNotificationParameter>(_BusinessNotificationParameter_QNAME,
            BusinessNotificationParameter.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BusinessNotificationParameterType }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link BusinessNotificationParameterType }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Microsoft.Crm.Sdk.Messages", name = "BusinessNotificationParameterType")
    public JAXBElement<BusinessNotificationParameterType> createBusinessNotificationParameterType(
        BusinessNotificationParameterType value) {
        return new JAXBElement<BusinessNotificationParameterType>(_BusinessNotificationParameterType_QNAME,
            BusinessNotificationParameterType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BusinessNotificationSeverity }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link BusinessNotificationSeverity }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Microsoft.Crm.Sdk.Messages", name = "BusinessNotificationSeverity")
    public JAXBElement<BusinessNotificationSeverity> createBusinessNotificationSeverity(
        BusinessNotificationSeverity value) {
        return new JAXBElement<BusinessNotificationSeverity>(_BusinessNotificationSeverity_QNAME,
            BusinessNotificationSeverity.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link List }{@code <}{@link String }{@code >}{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link List }{@code <}{@link String }{@code >}{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/crm/2011/Contracts", name = "RibbonLocationFilters", scope = ArrayOfRibbonLocationFilters.class)
    public JAXBElement<List<String>> createArrayOfRibbonLocationFiltersRibbonLocationFilters(List<String> value) {
        return new JAXBElement<List<String>>(_RibbonLocationFilters_QNAME, ((Class) List.class),
            ArrayOfRibbonLocationFilters.class,
            value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link List }{@code <}{@link String }{@code >}{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link List }{@code <}{@link String }{@code >}{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/crm/2011/Contracts", name = "AccessRights", scope = ArrayOfAccessRights.class)
    public JAXBElement<List<String>> createArrayOfAccessRightsAccessRights(List<String> value) {
        return new JAXBElement<List<String>>(_AccessRights_QNAME, ((Class) List.class), ArrayOfAccessRights.class,
            value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link List }{@code <}{@link String }{@code >}{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link List }{@code <}{@link String }{@code >}{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/xrm/2011/Metadata", name = "OwnershipTypes", scope = ArrayOfOwnershipTypes.class)
    public JAXBElement<List<String>> createArrayOfOwnershipTypesOwnershipTypes(List<String> value) {
        return new JAXBElement<List<String>>(_OwnershipTypes_QNAME, ((Class) List.class), ArrayOfOwnershipTypes.class,
            value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link List }{@code <}{@link String }{@code >}{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link List }{@code <}{@link String }{@code >}{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/xrm/2011/Metadata", name = "SecurityTypes", scope = ArrayOfSecurityTypes.class)
    public JAXBElement<List<String>> createArrayOfSecurityTypesSecurityTypes(List<String> value) {
        return new JAXBElement<List<String>>(_SecurityTypes_QNAME, ((Class) List.class), ArrayOfSecurityTypes.class,
            value);
    }

}
