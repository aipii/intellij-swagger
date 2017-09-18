package org.zalando.intellij.swagger.completion;

import com.intellij.codeInsight.completion.InsertHandler;
import com.intellij.codeInsight.lookup.LookupElement;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiFile;
import org.zalando.intellij.swagger.completion.field.model.common.Field;
import org.zalando.intellij.swagger.completion.value.model.common.Value;
import org.zalando.intellij.swagger.traversal.Traversal;
import org.zalando.intellij.swagger.traversal.path.swagger.PathResolver;

import java.util.List;
import java.util.Optional;

public class SwaggerCompletionHelper implements CompletionHelper {

    private final PsiElement psiElement;
    private final Traversal traversal;
    private final PathResolver pathResolver;

    public SwaggerCompletionHelper(final PsiElement psiElement,
                                   final Traversal traversal,
                                   final PathResolver pathResolver) {
        this.psiElement = psiElement;
        this.traversal = traversal;
        this.pathResolver = pathResolver;
    }

    public boolean completeRootKey() {
        return pathResolver.childOfRoot(psiElement);
    }

    public boolean completeInfoKey() {
        return pathResolver.childOfInfo(psiElement);
    }

    public boolean completeContactKey() {
        return pathResolver.childOfContact(psiElement);
    }

    public boolean completeLicenseKey() {
        return pathResolver.childOfLicense(psiElement);
    }

    public boolean completePathKey() {
        return pathResolver.childOfPath(psiElement);
    }

    public boolean completeOperationKey() {
        return pathResolver.childOfOperation(psiElement);
    }

    public boolean completeExternalDocsKey() {
        return pathResolver.childOfExternalDocs(psiElement);
    }

    public boolean completeParametersKey() {
        return pathResolver.childOfParameters(psiElement);
    }

    public boolean completeParameterItemsKey() {
        return pathResolver.childOfParameterItems(psiElement);
    }

    public boolean completeResponsesKey() {
        return pathResolver.childOfResponses(psiElement);
    }

    public boolean completeResponseKey() {
        return pathResolver.childOfResponse(psiElement);
    }

    public boolean completeHeaderKey() {
        return pathResolver.childOfHeader(psiElement);
    }

    public boolean completeHeadersKey() {
        return pathResolver.childOfHeaders(psiElement);
    }

    public boolean completeTagKey() {
        return pathResolver.childOfTag(psiElement);
    }

    public boolean completeSecurityDefinitionKey() {
        return pathResolver.childOfSecurityDefinition(psiElement);
    }

    public boolean completeSchemaKey() {
        return pathResolver.childOfSchema(psiElement);
    }

    public boolean completeSchemaItemsKey() {
        return pathResolver.childOfSchemaItems(psiElement);
    }

    public boolean completePropertiesSchemaKey() {
        return pathResolver.childOfPropertiesSchema(psiElement);
    }

    public boolean completeAdditionalPropertiesKey() {
        return pathResolver.childOfAdditionalProperties(psiElement);
    }

    public boolean completeXmlKey() {
        return pathResolver.childOfXml(psiElement);
    }

    public boolean completeDefinitionsKey() {
        return pathResolver.childOfDefinitions(psiElement);
    }

    public boolean completeParameterDefinitionKey() {
        return pathResolver.childOfParameterDefinition(psiElement);
    }

    public boolean completeMimeValue() {
        return pathResolver.isMimeValue(psiElement);
    }

    public boolean completeSchemesValue() {
        return pathResolver.isSchemesValue(psiElement);
    }

    public boolean completeDefinitionRefValue() {
        return pathResolver.isDefinitionRefValue(psiElement);
    }

    public boolean completeParameterRefValue() {
        return pathResolver.isParameterRefValue(psiElement);
    }

    public List<PsiElement> getChildrenOfArrayObject(final PsiElement psiElement) {
        return traversal.getChildrenOfArrayObject(psiElement);
    }

    public List<String> getTagNames() {
        return traversal.getTagNames(psiElement.getContainingFile());
    }

    public boolean isUniqueKey(final String keyName) {
        return traversal.isUniqueKey(keyName, psiElement);
    }

    public boolean isUniqueArrayStringValue(final String keyName) {
        return traversal.isUniqueArrayStringValue(keyName, psiElement);
    }

    public InsertHandler<LookupElement> createInsertFieldHandler(final Field field) {
        return traversal.createInsertFieldHandler(field);
    }

    public InsertHandler<LookupElement> createInsertValueHandler(final Value value) {
        return traversal.createInsertValueHandler(value);
    }

    public boolean completeBooleanValue() {
        return pathResolver.isBooleanValue(psiElement);
    }

    public boolean completeTypeValue() {
        return pathResolver.isTypeValue(psiElement);
    }

    public boolean completeFormatValue() {
        return pathResolver.isFormatValue(psiElement);
    }

    public boolean completeInValue() {
        return pathResolver.isInValue(psiElement);
    }

    public boolean completeResponseRefValue() {
        return pathResolver.isResponseRefValue(psiElement);
    }

    public boolean completeResponseDefinition() {
        return pathResolver.childOfResponseDefinition(psiElement);
    }

    public boolean completeRootSecurityKey() {
        return pathResolver.childOfRootSecurityKey(psiElement);
    }

    public boolean completeOperationSecurityKey() {
        return pathResolver.childOfOperationSecurityKey(psiElement);
    }

    public Optional<String> extractSecurityNameFromSecurityObject(final PsiElement psiElement) {
        return traversal.extractSecurityNameFromSecurityItem(psiElement);
    }

    public List<String> getSecurityScopesIfOAuth2(final PsiElement securityDefinitionItem) {
        return traversal.getSecurityScopesIfOAuth2(securityDefinitionItem);
    }

    public boolean completeSecurityScopeNameValue() {
        return pathResolver.isSecurityScopeNameValue(psiElement);
    }

    public Optional<String> getKeyNameOfObject(final PsiElement psiElement) {
        return traversal.getKeyNameOfObject(psiElement);
    }

    public PsiFile getPsiFile() {
        return psiElement.getContainingFile();
    }

    public Optional<String> getParentKeyName() {
        return traversal.getParentKeyName(psiElement);
    }

    public Optional<PsiElement> getParentByName(final String parentName) {
        return traversal.getParentByName(psiElement, parentName);
    }

    public boolean completeItemsCollectionFormat() {
        return pathResolver.childOfItemsCollectionFormat(psiElement);
    }

    public boolean completeParametersCollectionFormat() {
        return pathResolver.childOfParametersCollectionFormat(psiElement);
    }

    public boolean completeHeadersCollectionFormat() {
        return pathResolver.childOfHeadersCollectionFormat(psiElement);
    }

    public boolean completeTagsValue() {
        return pathResolver.isTagsValue(psiElement);
    }

}
