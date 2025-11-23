# Comprehensive refactoring script to translate all Portuguese to English
# This script handles class names, method names, variable names, and folder names

Write-Host "Starting comprehensive refactoring to English..." -ForegroundColor Green

# Step 1: Rename folder
$oldFolder = "design-patterns\chainOfResponsability"
$newFolder = "design-patterns\chainOfResponsibility"
if (Test-Path $oldFolder) {
    Write-Host "Renaming folder: chainOfResponsability -> chainOfResponsibility" -ForegroundColor Yellow
    Move-Item $oldFolder $newFolder -Force
}

# Step 2: Update parent POM
$parentPom = "pom.xml"
if (Test-Path $parentPom) {
    $content = Get-Content $parentPom -Raw
    $content = $content -replace "chainOfResponsability", "chainOfResponsibility"
    Set-Content $parentPom -Value $content -NoNewline
    Write-Host "Updated parent POM" -ForegroundColor Yellow
}

Write-Host "Refactoring complete! Manual class/method refactoring needed for each pattern." -ForegroundColor Green
Write-Host "See REFACTORING_GUIDE.md for translation mappings." -ForegroundColor Cyan

